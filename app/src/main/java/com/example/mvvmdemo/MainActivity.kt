package com.example.mvvmdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.mvvmdemo.home.HomeFragment
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(R.id.frmContainer, HomeFragment(), HomeFragment::class.java.simpleName).commit()
    }
}
