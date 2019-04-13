package com.example.assignment_week3

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_back_ground.*
import kotlinx.android.synthetic.main.activity_main.*

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

        currentBackground = getString(R.string.ManC)
        BtnBackGround.setOnClickListener(btnChangeBackgroundClicked)
        BtnBackGround.setOnClickListener {
            val intent: Intent =  Intent(this, BackGroundActivity::class.java)
            startActivity(intent)
        }
        BtnTitle.setOnClickListener {
            val intent: Intent =  Intent(this, TitleActivity::class.java)
            startActivity(intent)
        }

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == BACKGROUND_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            currentBackground = data?.getStringExtra(CURRENT_BACKGROUND)
            when (currentBackground) {
                getString(R.string.ManC) -> Btn.setImageResource(R.drawable.a)
                getString(R.string.Liv) -> Btn.setImageResource(R.drawable.b)
                getString(R.string.Che) -> Btn.setImageResource(R.drawable.c)
                getString(R.string.ManU) -> Btn.setImageResource(R.drawable.d)
                getString(R.string.Asr) -> Btn.setImageResource(R.drawable.e)
                getString(R.string.Tot) -> Btn.setImageResource(R.drawable.f)
            }
        }
    }
    private val btnChangeBackgroundClicked = View.OnClickListener {
        val intent = Intent(this, BackGroundActivity::class.java).apply {
            putExtra(CURRENT_BACKGROUND, currentBackground)
        }
        startActivityForResult(intent, BACKGROUND_REQUEST_CODE)
    }
}
