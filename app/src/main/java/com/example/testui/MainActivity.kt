package com.example.testui

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.google.android.material.datepicker.MaterialDatePicker
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


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
        val datePicker=findViewById<Button>(R.id.datePicker)
        datePicker.setOnClickListener({
            datePicker()
        })
        val dividerItemDecoration: ItemDecoration =
            DividerItemDecorator(ContextCompat.getDrawable(this, R.drawable.divider_shape)!!)
        recyclerView.addItemDecoration(dividerItemDecoration)




    }

    fun datePicker(){
        val builder = MaterialDatePicker.Builder.dateRangePicker()
        builder.setTitleText("Select Date Range")
        builder.setTheme(R.style.CustomDateRangePicker)
        val picker = builder.build()

        picker.show(supportFragmentManager, picker.toString())

        picker.addOnPositiveButtonClickListener { selection ->
            val start = selection.first?.let { Date(it) }
            val end = selection.second?.let { Date(it) }

            val formatter = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
            Log.d("Range", "Start: ${formatter.format(start)}, End: ${formatter.format(end)}")
        }

    }

}