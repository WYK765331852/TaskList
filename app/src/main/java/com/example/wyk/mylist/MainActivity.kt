package com.example.wyk.mylist

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View

//字段后加!!像Java一样抛出空异常，另一种字段后加?可不做处理返回值为 null或配合?:做空判断处理
class MainActivity : AppCompatActivity() {
    private var mToolbar: Toolbar? = null
    private var mListViewPagerAdapter: ListViewPagerAdapter? = null
    var mRecyclerViewAdapter: RecyclerViewAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mToolbar = findViewById(R.id.main_toolbar)
        setSupportActionBar(mToolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        mToolbar!!.setNavigationOnClickListener(View.OnClickListener {
            onBackPressed()
        })
        mToolbar!!.title = "TaskList"


    }
}
