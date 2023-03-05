package com.hakaninc.newtoggproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var fragmentFactory: FragmentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        fragmentFactory = FragmentFactory()

        supportFragmentManager.fragmentFactory = fragmentFactory

        setContentView(R.layout.activity_main)

    }
}