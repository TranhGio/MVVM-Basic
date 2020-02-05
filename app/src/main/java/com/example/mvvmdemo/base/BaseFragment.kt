package com.example.mvvmdemo.base

import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    override fun onResume() {
        super.onResume()
        bindViewModel()
    }

    abstract fun bindViewModel()
}
