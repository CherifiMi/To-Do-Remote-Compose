package com.example.todocompose.data.models


data class ToDoTask(
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Int
)