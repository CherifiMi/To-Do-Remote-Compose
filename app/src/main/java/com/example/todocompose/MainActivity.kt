package com.example.todocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.todocompose.navigation.Navigation
import com.example.todocompose.ui.theme.ToDoComposeTheme
import com.example.todocompose.viewModel.SharedViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    lateinit var navController: NavHostController
    private val sharedViewModel: SharedViewModel by viewModels()

    @ExperimentalAnimationApi
    @ExperimentalComposeUiApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoComposeTheme {
                navController = rememberNavController()
                Navigation(navController = navController, sharedViewModel)
            }
        }
    }
}
