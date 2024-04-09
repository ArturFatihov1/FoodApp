package com.example.test
import android.annotation.SuppressLint
import android.content.Intent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class AdapterDetailedFood:RecyclerView.Adapter<AdapterDetailedFood.UserViewHolder>() {

    var foodList1 = emptyList<DataFood>()

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val textView:TextView = itemView.findViewById(R.id.textView5)
            val textView1:TextView = itemView.findViewById(R.id.textView6)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.detailed_food_list, parent, false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foodList1.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.textView.text = foodList1[position].Title
        holder.textView1.text = foodList1[position].info
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<DataFood>) {
        foodList1 = list
        notifyDataSetChanged()
    }

}

