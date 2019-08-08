package com.lambdaschool.edittextdemo

import android.content.ClipData
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    //The method must accept a String to be the view's text attribute and an int which is the index where the element is stored in the List.
    fun createTextView(textAtt: String, listElementIndexNum: Int): TextView {
        val tv = TextView(this)
        tv.text = textAtt
        tv.textSize = 18f
        return tv
    }

}
