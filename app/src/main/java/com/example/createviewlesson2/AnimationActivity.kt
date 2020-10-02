package com.example.createviewlesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_animation.*

class AnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)
        val animAlpha = AnimationUtils.loadAnimation(this, R.anim.alpha_anim)
        alphaBtn.setOnClickListener {
            it.startAnimation(animAlpha)

        }
    }
}