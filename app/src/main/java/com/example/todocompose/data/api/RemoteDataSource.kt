package com.example.todocompose.data.api

import com.example.todocompose.data.models.ToDoTask
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource  @Inject constructor(private val tasksApi: TasksApi){
    suspend fun getAllTasks():Response<List<ToDoTask>>{
        return tasksApi.getAllTasks()
    }
}