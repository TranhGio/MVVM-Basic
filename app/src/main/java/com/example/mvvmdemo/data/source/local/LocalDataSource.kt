package com.example.mvvmdemo.data.source.local

import com.example.mvvmdemo.data.source.datasource.LocalDataSource

class LocalDataSource : LocalDataSource {
    override fun getListName(): ArrayList<String> {
        return arrayListOf("Nguyen Dang Vinh", "Tran Tan Chung", "Phan Minh Ha", "Vu Trong Phung")
    }

}
