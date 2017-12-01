package com.example.wyk.mylist

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.util.Log

/**
 * Created by chen on 2017/11/14.
 */
class ListViewPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {
    private var fragmentList = ArrayList<Fragment>()
    private val mTitleArray = arrayOf("going","减分项","done")
    private var mFragmentArray = arrayOf(ListFragment(), ListFragment2(), ListFragment3())
    private var mContext: Context? = null

    override fun getItem(position: Int): Fragment {
//        TODO("not implemented")
        //To change body of created functions use File | Settings | File Templates.
//        if (position == 0){
//            var listFragment = ListFragment()
//            Log.d("aaaa", "dddd")
//            return listFragment
//        }else if (position == 1){
//            var listFragment2 = ListFragment2()
//            return listFragment2
//        }else if (position == 2){
//            var listFragment3 = ListFragment3()
//            return listFragment3
//        }
//        var listFragment= ListFragment()
//        return listFragment

        Log.d("aaaa", position.toString())
        return fragmentList.get(position)

    }

    override fun getCount(): Int {
//        TODO("not implemented")
        //To change body of created functions use File | Settings | File Templates.
        return fragmentList.size
    }

    fun add(fragment: Fragment){
        fragmentList.add(fragment)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mTitleArray[position]
    }

}