package com.example.wyk.mylist

/**
 * Created by chen on 2017/11/13.
 */
class ListBean {
    private var title: String? = null
    private var score: Int? = null
    fun setTitle(title: String) {
        this.title = title
    }

    fun getTitle(title: String): String {
        return title
    }

    fun setScore(score: Int) {
        this.score = score
    }

    fun getScore(score: Int): Int{
        return score
    }
}