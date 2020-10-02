package com.example.createviewlesson2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    private var gravity = Gravity.NO_GRAVITY

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.gravityCenter -> gravity = Gravity.CENTER_HORIZONTAL
                R.id.gravityLeft -> gravity = Gravity.LEFT
                R.id.gravityRight -> gravity = Gravity.RIGHT
            }
        }

        next.setOnClickListener { startActivity(Intent(this, ThirdActivity::class.java)) }

        create.setOnClickListener {
            create(gravity)
        }
    }


    private fun create(gravity: Int) {
        val btn = Button(this)
        val layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        btn.gravity = gravity
        btn.text = ed.text
        btn.layoutParams = layoutParams
        linearLayout.addView(btn)
    }
}