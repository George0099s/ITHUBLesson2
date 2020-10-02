package com.example.createviewlesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_adapter.*

class AdapterActivity : AppCompatActivity() {
    private val list = arrayListOf(1, 2, 3, 4, 5, 6, 6, 67)
    private lateinit var arrayAdapter: ArrayAdapter<Int>
    private lateinit var myAdapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapter)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)
        myAdapter = MyAdapter(
            arrayListOf(
                Person("Dima", "Student", R.color.colorAccent),
                Person("Andey","Teacher", R.color.colorPrimaryDark)
            ), applicationContext
        )

        listView.adapter = myAdapter

        add.setOnClickListener {
            add()
        }
        delete.setOnClickListener {
            remove()
        }

    }

    private fun remove() {
        if (ed.text.isNotEmpty()) {
            arrayAdapter.remove(ed.text.toString().toInt())
            arrayAdapter.notifyDataSetChanged()
        } else makeToast()
    }

    private fun add() {
        if (ed.text.isNotEmpty()) {
            arrayAdapter.add(ed.text.toString().toInt())
            arrayAdapter.notifyDataSetChanged()
        } else makeToast()
    }

    private fun makeToast() {
        Toast.makeText(this, "smthg went wrong :(", Toast.LENGTH_SHORT).show()
    }

}