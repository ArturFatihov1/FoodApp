package com.example.test.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.test.model.DataFood
import com.example.test.R

class AdapterDetailedFood(private val foodList: List<DataFood>) :
    RecyclerView.Adapter<AdapterDetailedFood.UserViewHolder>() {

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = itemView.findViewById(R.id.textView5)
        val textView1: TextView = itemView.findViewById(R.id.textView6)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.detailed_food_list, parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.textView.text = foodList[position].Title
        holder.textView1.text = foodList[position].info
    }

}

