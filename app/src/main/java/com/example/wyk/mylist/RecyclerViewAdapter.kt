package com.example.wyk.mylist

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by chen on 2017/11/13.
 */
class RecyclerViewAdapter(var mContext: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val NORMAL_TYPE: Int = 0
    private var mTaskList: List<ListBean>? = null

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
//        TODO("not implemented")
        //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
//        TODO("not implemented")
        //To change body of created functions use File | Settings | File Templates.
        if (viewType == NORMAL_TYPE){
            var v:View = LayoutInflater.from(parent!!.context).inflate(R.layout.list_item_list, parent, false)
            var normalHolder: NormalHolder = NormalHolder(v)
            return normalHolder
        }
        return NormalHolder(LayoutInflater.from(parent!!.context).inflate(R.layout.list_item_list, parent, false))
    }

    override fun getItemCount(): Int {
//        TODO("not implemented")
        //To change body of created functions use File | Settings | File Templates.
        return mTaskList!!.size
    }

    override fun getItemViewType(position: Int): Int {
        return NORMAL_TYPE
    }

    internal inner class NormalHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var title: TextView
        var score: TextView
        var icon: ImageView

        init {
            title = itemView!!.findViewById(R.id.list_main_cv_title)
            score = itemView.findViewById(R.id.list_main_cv_score)
            icon = itemView.findViewById(R.id.list_main_cv_iv)
        }
    }
}