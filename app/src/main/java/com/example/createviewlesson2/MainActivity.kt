package com.example.createviewlesson2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        secondActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        animActivity.setOnClickListener {
            startActivity(Intent(this, AnimationActivity::class.java))
        }

        listActivity.setOnClickListener {
            startActivity(Intent(this, AdapterActivity::class.java))
        }


    }
}