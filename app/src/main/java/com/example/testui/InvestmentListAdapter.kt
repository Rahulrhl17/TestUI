package com.example.testui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.button.MaterialButton


class InvestmentListAdapter(private val items: List<String>,val context:Context) :
    RecyclerView.Adapter<InvestmentListAdapter.MyRecyclerViewDataHolder>() {

    inner class MyRecyclerViewDataHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRecyclerViewDataHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.investment_list_card, parent, false)
        return MyRecyclerViewDataHolder(view)
    }

    override fun onBindViewHolder(holder: MyRecyclerViewDataHolder, position: Int) {
        val currentItem = items[position]

        val text: TextView = holder.itemView.findViewById(R.id.itemName)
        text.text = currentItem
        text.setOnClickListener({
            showDetailsConformationBottomSheetDialog(context)
        })

    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun showDetailsConformationBottomSheetDialog(context: Context){

        // creating a variable for our bottom sheet dialog.
        val bottomSheetTeachersDialog =
            BottomSheetDialog(context, R.style.AppBottomSheetDialogTheme)
        val layout: View = LayoutInflater.from(context)
            .inflate(R.layout.details_confirmation_bottom_sheet, null)
        val yes=layout.findViewById<MaterialButton>(R.id.yes)
        yes.setOnClickListener({
            showRepresentativeCodeBottomSheetDialog(context)
        })
        bottomSheetTeachersDialog.setCancelable(true)
        bottomSheetTeachersDialog.setCanceledOnTouchOutside(true)
        bottomSheetTeachersDialog.setContentView(layout)
        bottomSheetTeachersDialog.show()
    }

    fun showRepresentativeCodeBottomSheetDialog(context: Context){

        // creating a variable for our bottom sheet dialog.
        val bottomSheetTeachersDialog =
            BottomSheetDialog(context, R.style.AppBottomSheetDialogTheme)
        val layout: View = LayoutInflater.from(context)
            .inflate(R.layout.representative_code_bottom_sheet, null)
        val yes=layout.findViewById<MaterialButton>(R.id.apply)
        yes.setOnClickListener({
            showTermsConditionBottomSheetDialog(context)
        })
        bottomSheetTeachersDialog.setCancelable(true)
        bottomSheetTeachersDialog.setCanceledOnTouchOutside(true)
        bottomSheetTeachersDialog.setContentView(layout)
        bottomSheetTeachersDialog.show()
    }
    fun showTermsConditionBottomSheetDialog(context: Context){

        // creating a variable for our bottom sheet dialog.
        val bottomSheetTeachersDialog =
            BottomSheetDialog(context, R.style.AppBottomSheetDialogTheme)
        val layout: View = LayoutInflater.from(context)
            .inflate(R.layout.terms_conditions_bottom_sheet, null)

        bottomSheetTeachersDialog.setCancelable(true)
        bottomSheetTeachersDialog.setCanceledOnTouchOutside(true)
        bottomSheetTeachersDialog.setContentView(layout)
        bottomSheetTeachersDialog.show()
    }
}