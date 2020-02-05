package com.example.mvvmdemo.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mvvmdemo.NameAdapter
import com.example.mvvmdemo.R
import com.example.mvvmdemo.base.BaseFragment
import com.example.mvvmdemo.data.source.Repository
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {

    private var names = ArrayList<String>()
    private lateinit var nameViewModel: HomeContract

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        nameViewModel = NameViewModel(Repository())
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        return view
    }

    override fun bindViewModel() {
        Log.i("MVVM debug", "Binding view model")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        names = nameViewModel.getNames()
        val adapter = NameAdapter(names)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter
    }
}
