package com.example.testui

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration


class MainActivity : AppCompatActivity() {

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        var list= listOf("Digital Gold","Fixed Deposit","Mutual Funds","Mutual Funds")
        val myRecyclerViewAdapter = InvestmentListAdapter(list,this)
        recyclerView.adapter = myRecyclerViewAdapter
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = layoutManager

        val dividerItemDecoration: ItemDecoration =
            DividerItemDecorator(ContextCompat.getDrawable(this, R.drawable.divider_shape)!!)
        recyclerView.addItemDecoration(dividerItemDecoration)




    }
}