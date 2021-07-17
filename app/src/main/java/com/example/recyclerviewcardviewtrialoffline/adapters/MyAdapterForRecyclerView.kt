package com.example.recyclerviewcardviewtrialoffline.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewcardviewtrialoffline.R

import kotlinx.android.synthetic.main.card_view_model.view.*


class MyAdapterForRecyclerView(val numbers: Array<String> ) :
    RecyclerView.Adapter<MyAdapterForRecyclerView.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val cardNumber: Any = itemView.textView

    }
//----------------------------------------------------------------------------------------------------------------
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.card_view_model, parent, false)

        return ViewHolder(view)
    }
//----------------------------------------------------------------------------------------------------------------

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemView.textView.text = numbers[position]

    }

//----------------------------------------------------------------------------------------------------------------
    override fun getItemCount(): Int {
        return numbers.size
        val view: View
    }
//----------------------------------------------------------------------------------------------------------------
}