package com.example.wyk.mylist

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.Menu
import android.widget.Toast
import com.example.wyk.mylist.ListTaskDialog.OnNegativeBtClickListener

//字段后加!!像Java一样抛出空异常，另一种字段后加?可不做处理返回值为 null或配合?:做空判断处理
class MainActivity : AppCompatActivity() {
    lateinit var mToolbar: Toolbar
    lateinit var mTabLayout: TabLayout
    lateinit var mViewPager:ViewPager
    lateinit var mFloatingActionBt: FloatingActionButton
    lateinit var mListViewPagerAdapter: ListViewPagerAdapter
    lateinit var mPositive: ListTaskDialog.OnPositiveBtClickListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_main)
        mToolbar = findViewById(R.id.list_main_toolbar)
        mTabLayout = findViewById(R.id.list_main_tab)
        mViewPager = findViewById(R.id.list_main_vp)
        mFloatingActionBt = findViewById(R.id.list_main_floatbar)

        setSupportActionBar(mToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        mToolbar.setNavigationOnClickListener {
            onBackPressed()
        }
        mToolbar.setOnMenuItemClickListener(onMenuClickListener)

        title = "wish list"

        mListViewPagerAdapter = ListViewPagerAdapter(supportFragmentManager)

        mListViewPagerAdapter?.apply {
            add(ListFragment())
            add(ListFragment2())
            add(ListFragment3())
        }

        Log.d("aaaa", "ffff")

        mViewPager.adapter = mListViewPagerAdapter
        mTabLayout.setupWithViewPager(mViewPager)

        mFloatingActionBt.setOnClickListener {
            Toast.makeText(this@MainActivity, "floating", Toast.LENGTH_SHORT).show()
            val listTaskDialog = ListTaskDialog(
                    this@MainActivity,
                    R.style.Base_Theme_AppCompat_Dialog,

                    )

        }

    }

    private var onMenuClickListener = Toolbar.OnMenuItemClickListener {
        Toast.makeText(this@MainActivity, "plus", Toast.LENGTH_SHORT).show()
        true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.list_toolbar_menu, menu)
        return true
    }

}
