package com.example.mvvmdemo.data.source

import com.example.mvvmdemo.data.source.datasource.LocalDataSource
import com.example.mvvmdemo.data.source.datasource.RemoteDataSource

class Repository : LocalDataSource, RemoteDataSource {

    private var localDataSource = com.example.mvvmdemo.data.source.local.LocalDataSource()

    private var remoteDataSource = com.example.mvvmdemo.data.source.remote.RemoteDataSource()

    override fun getListName(): ArrayList<String> = localDataSource.getListName()

    override fun getListFromApi(apiUrl: String): ArrayList<String> =
        remoteDataSource.getListFromApi(apiUrl)
}