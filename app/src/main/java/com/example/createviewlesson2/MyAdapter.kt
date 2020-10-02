package com.example.createviewlesson2

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import org.w3c.dom.Text

class MyAdapter(val items: List<Person>, val context: Context) : BaseAdapter() {

    var inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    private val TAG = "MyAdapter"


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        val item = items[position]
        if (view == null)
            view = inflater.inflate(R.layout.list_item, parent, false)
        view?.let {
            it.findViewById<TextView>(R.id.name).text = item.name
            it.findViewById<TextView>(R.id.type).text = item.type
            it.findViewById<ImageView>(R.id.img).setBackgroundColor(ContextCompat.getColor(context, item.color))
        }
        return view!!

    }

    override fun getItem(position: Int): Any = items[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getCount(): Int = items.size

}