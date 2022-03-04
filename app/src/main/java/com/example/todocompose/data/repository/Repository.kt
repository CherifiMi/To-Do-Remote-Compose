package com.example.todocompose.data.repository

import com.example.todocompose.data.api.RemoteDataSource
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class Repository @Inject constructor(remoteDataSource: RemoteDataSource){
    val remote = remoteDataSource
}