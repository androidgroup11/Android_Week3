package com.example.assignment_week3

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_back_ground.*

class TitleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title)
        BtnSave.setOnClickListener {
            val intent: Intent =  Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
