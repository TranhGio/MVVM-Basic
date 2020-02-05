package com.example.mvvmdemo.data.source.datasource

interface RemoteDataSource {
    fun getListFromApi(apiUrl: String): ArrayList<String>
}
