package com.example.mvvmdemo.home

import com.example.mvvmdemo.data.source.Repository

class NameViewModel(private val repository: Repository) : HomeContract {

    override fun getNames(): ArrayList<String> = repository.getListName()
}
