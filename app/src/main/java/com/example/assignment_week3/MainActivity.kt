package com.example.assignment_week3

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat
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

        currentTitle = getString(R.string.default_title)
        currentTitleColor = ContextCompat.getColor(this, R.color.Red);

        BtnBackGround.setOnClickListener(btnChangeBackgroundClicked)
        BtnTitle.setOnClickListener(btnChangeTitleClicked)

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
        if (requestCode == TITLE_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
            currentTitle = data?.getStringExtra(CURRENT_TITLE)
            currentTitleColor = data?.getIntExtra(CURRENT_TITLE_COLOR, 0)!!

            text_main_title.setTextColor(currentTitleColor)
            text_main_title.setText(currentTitle)
        }
    }
    private val btnChangeBackgroundClicked = View.OnClickListener {
        val intent = Intent(this, BackGroundActivity::class.java).apply {
            putExtra(CURRENT_BACKGROUND, currentBackground)
        }
        startActivityForResult(intent, BACKGROUND_REQUEST_CODE)
    }
    private val btnChangeTitleClicked = View.OnClickListener {
        val intent = Intent(this, TitleActivity::class.java).apply {
            putExtra(CURRENT_TITLE, currentTitle)
            putExtra(CURRENT_TITLE_COLOR, currentTitleColor)
        }
        startActivityForResult(intent, TITLE_REQUEST_CODE)
    }
}
