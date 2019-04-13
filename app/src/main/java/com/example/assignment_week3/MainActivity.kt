package com.example.assignment_week3

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

const val CURRENT_BACKGROUND = "current_background"
const val CURRENT_TITLE = "current_title"
const val CURRENT_TITLE_COLOR = "current_title_color"

const val BACKGROUND_REQUEST_CODE = 1000
const val TITLE_REQUEST_CODE = 1001

class MainActivity : AppCompatActivity() {
    private var currentBackground :String? = null
    private var currentTitle :String? = null
    private var currentTitleColor :Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}
