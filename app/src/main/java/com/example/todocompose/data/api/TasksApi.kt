package com.example.todocompose.data.api

import com.example.todocompose.data.models.ToDoTask
import retrofit2.Response
import retrofit2.http.GET

interface TasksApi {
    @GET("/tasks")
    suspend fun getAllTasks():Response<List<ToDoTask>>
}