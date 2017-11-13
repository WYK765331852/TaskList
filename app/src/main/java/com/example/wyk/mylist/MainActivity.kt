package com.example.wyk.mylist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    private var mToolbar: Toolbar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mToolbar = findViewById(R.id.main_toolbar)
        mToolbar
    }
}
