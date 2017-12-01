package com.example.wyk.mylist

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.DatePicker
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import com.orhanobut.hawk.Hawk

/**
 * Created by chen on 2017/11/16.
 */
class ListTaskDialog constructor(context: Context, themeResId: Int, positive: OnPositiveBt, onNegativeBtClickListener: OnNegativeBtClickListener) : Dialog{
    var mContext: Context? = null
    lateinit var mGeneralTv: TextView
    lateinit var mEmergency: TextView
    lateinit var mSwitch: Switch
    lateinit var mNegativeBt: ImageView
    lateinit var mPositiveBt: ImageView
    lateinit var mDatePicker: DatePicker
    var mPositiveBtListener: OnPositiveBtClickListener? = null
    var positive: OnPositiveBt? = null
    var mNegativeBtListener: OnNegativeBtClickListener? = null

    init {
        this.mContext = context
        //this.mPositiveBtListener = onPositiveBtClickListener
        this.positive = positive
        this.mNegativeBtListener = onNegativeBtClickListener
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_dialog_task)
        mGeneralTv = findViewById(R.id.list_main_dialog_event)
        mEmergency = findViewById(R.id.list_main_dialog_emergency)
        mSwitch = findViewById(R.id.list_main_dialog_swith)
        mNegativeBt = findViewById(R.id.list_main_dialog_negative)
        mPositiveBt = findViewById(R.id.list_main_dialog_positive)
        mDatePicker = findViewById(R.id.list_main_dialog_date)

        Hawk.init(mContext)

        mGeneralTv.setOnClickListener { Hawk.put("urgent", "1") }
        mEmergency.setOnClickListener { Hawk.put("urgent", "2") }

        mSwitch.setOnClickListener { Hawk.put("switch", "1") }

        mNegativeBt.setOnClickListener { mNegativeBtListener?.onClick(this@ListTaskDialog, true) }
        mPositiveBt.setOnClickListener { mPositiveBtListener?.onClick(this@ListTaskDialog, true) }

    }

    fun setClickCallback(callback: () -> Unit) {
        callback
    }

    interface OnPositiveBtClickListener {
        fun onClick(dialog: Dialog, confirm: Boolean)
    }

    interface OnNegativeBtClickListener {
        fun onClick(dialog: Dialog, confirm: Boolean)
    }

}