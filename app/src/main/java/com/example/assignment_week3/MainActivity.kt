package com.example.assignment_week3

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BtnBackGround.setOnClickListener {
            val intent: Intent =  Intent(this, BackGroundActivity::class.java)
            startActivity(intent)
        }
        BtnTitle.setOnClickListener {
            val intent: Intent =  Intent(this, TitleActivity::class.java)
            startActivity(intent)
        }
    }
}
