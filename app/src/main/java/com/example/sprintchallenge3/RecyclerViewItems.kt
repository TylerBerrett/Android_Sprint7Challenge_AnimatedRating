package com.example.sprintchallenge3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.display_recycler_view.view.*

class RecyclerViewItems(val data: ArrayList<CreateItem>) : RecyclerView.Adapter<RecyclerViewItems.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.display_recycler_view, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameLocation.text = data[position].name
        holder.ratingLocation.text = data[position].rating.toString()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val nameLocation = itemView.name_location
        val ratingLocation = itemView.rating_location
    }

}