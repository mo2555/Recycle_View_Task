package com.example.shilongoleague

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ImageView.*
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {
    val dataD = ArrayList<data>()
    val  adapter = CustomAdapter(dataD)
    lateinit var recycler: RecyclerView
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        reData()
        reData()
        reData()
        recycler = findViewById(R.id.recView)
        recycler.layoutManager =LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        recycler.adapter = adapter

    }

    fun reData(){
        dataD.add(data("Ben 2lby",R.drawable.eblaa))
        dataD.add(data("Emam",R.drawable.emam))
        dataD.add(data("Tarek Hamed",R.drawable.rock))
        dataD.add(data("Shika",R.drawable.shika))
        dataD.add(data("Don't cry",R.drawable.shika2))
        dataD.add(data("League",R.drawable.shilongo))
    }
}