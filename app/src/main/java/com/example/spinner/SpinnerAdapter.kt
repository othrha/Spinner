package com.example.spinner

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class SpinnerAdapter(context: Activity, id: Int, var list: ArrayList<ItemData>) :
    ArrayAdapter<ItemData?>(context, id, list as List<ItemData?>) {
    var context: Activity? = null
    var inflater: LayoutInflater

    init {
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val itemView = inflater.inflate(R.layout.spinnerrow, parent, false)
        val imageView = itemView.findViewById<View>(R.id.image_and) as ImageView
        val txtname = itemView.findViewById<TextView>(R.id.title)
        val txtdetails = itemView.findViewById<TextView>(R.id.content_text)
        val rowd = list[position]
        txtname.text = rowd.name
        txtdetails.text=rowd.details
        imageView.setImageResource(rowd.image)
        return itemView
    }

    override fun getDropDownView(position: Int, convertView: View, parent: ViewGroup): View {
        return getView(position, convertView, parent)
    }
}