package com.example.wyk.mylist

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by chen on 2017/11/14.
 */
class ListViewPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {
    private var fragmentList = ArrayList<Fragment>()
    private val mTitleArray = arrayOf("任务","减分项","成就")
    private var mContext: Context? = null

    override fun getItem(position: Int): Fragment {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        fragmentList.get(position)

    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return fragmentList!!.size
    }

    fun add(fragment: Fragment){
        fragmentList.add(fragment)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mTitleArray[position]
    }


}