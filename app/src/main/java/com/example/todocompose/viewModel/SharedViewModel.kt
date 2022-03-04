package com.example.todocompose.viewModel

import android.app.Application
import android.util.Log
import androidx.compose.runtime.*
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todocompose.data.models.Priority
import com.example.todocompose.data.models.ToDoTask
import com.example.todocompose.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(
    private val repository: Repository,
    application: Application
): AndroidViewModel(application) {



    private val _allTasks =
        MutableStateFlow<List<ToDoTask>>(emptyList())

    val allTasks: StateFlow<List<ToDoTask>> = _allTasks

    val taskprio = mutableStateOf(0)
    val tasktitle = mutableStateOf("")
    val taskdis = mutableStateOf("")

    val addscreenanim = mutableStateOf(false)



    fun getAllTasks(){
        viewModelScope.launch(Dispatchers.IO) {
            _allTasks.value = repository.remote.getAllTasks().body()!!
        }
        Log.d("APITEST", allTasks.toString())
    }

    /*
    fun addTask(task: ToDoTask){
        viewModelScope.launch(Dispatchers.IO){
            repository.addTask(task)
        }
    }
    fun updateTask(task: ToDoTask){
        viewModelScope.launch(Dispatchers.IO){
            repository.updateTask(task)
        }
    }

    fun deleteTask(task: ToDoTask){
        viewModelScope.launch(Dispatchers.IO){
            repository.deleteTask(task)
        }
    }

    fun addTaskInScreen(){
            if(
                tasktitle.value.isNotEmpty()&&
                taskdis.value.isNotEmpty()&&
                taskprio.value>0){
                addTask(
                    ToDoTask(
                        0,
                        tasktitle.value,
                        taskdis.value,
                        priority =
                        when(taskprio.value){
                            1->Priority.LOW
                            2->Priority.MEDIUM
                            3->Priority.HIGH
                            else->{Priority.NONE}
                        }
                    )
                )

                prioValue(0)
                titleValue("")
                discValue("")

                    this.addScreenAnim(false)

                Log.d("HILLO", "YESSSS")

            }else{
                Log.d("HILLO", "NOOOOO")
            }
    }

    fun updateTaskInScreen(){
        if(
            updatetasktitle.value.isNotEmpty()&&
            updatetaskdis.value.isNotEmpty()&&
            updatetaskprio.value>0){

            Log.d("HILLOUPDATE", updatetasktitle.value)

            updateTask(
                ToDoTask(
                    updatetaskid.value,
                    updatetasktitle.value,
                    updatetaskdis.value,
                    when(updatetaskprio.value){
                        1->Priority.LOW
                        2->Priority.MEDIUM
                        3->Priority.HIGH
                        else->{Priority.NONE}
                    }
                )
            )

            updatePrioValue(0)
            updateTitleValue("")
            updateDiscValue("")

            Log.d("HILLO", "YESSSS")

        }else{
            Log.d("HILLO", "NOOOOO")
        }
    }

     */

    fun prioValue(b: Int) {
        this.taskprio.value = b
    }
    fun titleValue(text: String) {
        this.tasktitle.value = text
    }
    fun discValue(text: String) {
        this.taskdis.value = text
    }

    fun addScreenAnim(b: Boolean){
        this.addscreenanim.value = b
    }

}

