package com.example.wyk.mylist

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by chen on 2017/11/16.
 */
class ListFragment3 : Fragment() {
    var text: TextView? = null
    var image:ImageView?=null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v: View = inflater.inflate(R.layout.java_activity, container, false)
        text = v.findViewById(R.id.java_text)
//        text!!.text = "kotlin"
        return v
    }
}