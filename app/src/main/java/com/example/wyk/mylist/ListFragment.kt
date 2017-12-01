package com.example.wyk.mylist

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by chen on 2017/11/14.
 */
class ListFragment : Fragment() {
    var mRecyclerView: RecyclerView? = null
    var mRecyclerViewAdapter: RecyclerViewAdapter? = null
    var mTaskList: List<ListBean>? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v:View = inflater.inflate(R.layout.list_fragment_recyclerview, container, false)
        mRecyclerView = v.findViewById(R.id.list_fragment_rcv)
        mRecyclerViewAdapter = RecyclerViewAdapter(this.context)
        mRecyclerView!!.adapter = mRecyclerViewAdapter
        return v
    }
}