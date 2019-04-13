package com.example.assignment_week3

import android.app.Activity
import android.content.Intent
import android.content.res.ColorStateList
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_title.*

class TitleActivity : AppCompatActivity() {

    private var currentTitle :String? = null
    private var currentTitleColor :Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title)
        currentTitle = intent.getStringExtra(CURRENT_TITLE)
        currentTitleColor = intent.getIntExtra(CURRENT_TITLE_COLOR, 0)
        text.setText(currentTitle)
        text.setTextColor(currentTitleColor)
        viewcolor.backgroundTintList = ColorStateList.valueOf(currentTitleColor)

        BtnR.setOnClickListener(btnRClicked)
        BtnP.setOnClickListener(btnPClicked)
        BtnI.setOnClickListener(btnIClicked)
        BtnB.setOnClickListener(btnBClicked)
        BtnT.setOnClickListener(btnTClicked)
        BtnG.setOnClickListener(btnGClicked)

        BtnSave.setOnClickListener(btSaveTitleClicked)
        //bt_cancle_title.setOnClickListener(btCancleTitleClicked)
    }
    private val btnRClicked = View.OnClickListener {
        currentTitleColor = ContextCompat.getColor(this,R.color.Red)
        text.setTextColor(currentTitleColor)
        viewcolor.backgroundTintList = ColorStateList.valueOf(currentTitleColor)
    }

    private val btnPClicked = View.OnClickListener {
        currentTitleColor = ContextCompat.getColor(this,R.color.Purple)
        text.setTextColor(currentTitleColor)
        viewcolor.backgroundTintList = ColorStateList.valueOf(currentTitleColor)
    }

    private val btnIClicked = View.OnClickListener {
        currentTitleColor = ContextCompat.getColor(this,R.color.Indigo)
        text.setTextColor(currentTitleColor)
        viewcolor.backgroundTintList = ColorStateList.valueOf(currentTitleColor)
    }

    private val btnBClicked = View.OnClickListener {
        //currentTitleColor = ResourcesCompat.getColor(getResources(), R.color.Blue, null);
        currentTitleColor = ContextCompat.getColor(this,R.color.Purple)
        text.setTextColor(currentTitleColor)
        viewcolor.backgroundTintList = ColorStateList.valueOf(currentTitleColor)
    }

    private val btnTClicked = View.OnClickListener {
        currentTitleColor = ContextCompat.getColor(this,R.color.Teal)
        text.setTextColor(currentTitleColor)
        viewcolor.backgroundTintList = ColorStateList.valueOf(currentTitleColor)
    }

    private val btnGClicked = View.OnClickListener {
        currentTitleColor = ContextCompat.getColor(this,R.color.Green)
        text.setTextColor(currentTitleColor)
        viewcolor.backgroundTintList = ColorStateList.valueOf(currentTitleColor)
    }

    private val btSaveTitleClicked = View.OnClickListener {
        currentTitle = text.text.toString()

        if (!currentTitle.isNullOrBlank()) {
            val intent = Intent()
            intent.putExtra(CURRENT_TITLE, currentTitle)
            intent.putExtra(CURRENT_TITLE_COLOR, currentTitleColor)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
        else {
            Toast.makeText(this, "Title must not be blank", Toast.LENGTH_SHORT).show()
        }
    }

}

