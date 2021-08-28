package com.example.shilongoleague

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter (val dataList:ArrayList<data>):RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
    val txtName : TextView = itemView.findViewById(R.id.textView)
    val image : ImageView = itemView.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    val v = LayoutInflater.from(parent.context).inflate(R.layout.view,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
   var list =  dataList[position]
        holder.txtName.text = list.name
        holder.image.setImageResource(list.image)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

}