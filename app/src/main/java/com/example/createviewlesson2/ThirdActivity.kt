package com.example.createviewlesson2

import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    private lateinit var params1: LinearLayout.LayoutParams
    private lateinit var params2: LinearLayout.LayoutParams

//    private var params2 = LinearLayout.LayoutParams(
//        LinearLayout.LayoutParams.WRAP_CONTENT,
//        LinearLayout.LayoutParams.WRAP_CONTENT
//    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        sb.setOnSeekBarChangeListener(this)

        params1 = (text1.layoutParams) as LinearLayout.LayoutParams
        params2 = text2.layoutParams as LinearLayout.LayoutParams

    }

    override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
        params1.width = progress
        params2.width = seekBar.max - progress
        text1.apply {
            text = progress.toString()
            layoutParams = params1
        }
        text2.apply {
            text = (seekBar.max - progress).toString()
            layoutParams = params2
        }
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
    }
}