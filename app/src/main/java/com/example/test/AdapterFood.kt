package com.example.test

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterFood: RecyclerView.Adapter<AdapterFood.UserViewHolder>()  {

        var foodList = emptyList<DataFood>()

        class UserViewHolder(view: View): RecyclerView.ViewHolder(view){
            val title: TextView = itemView.findViewById(R.id.textView)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.card_food, parent , false)
            return UserViewHolder(view)
        }

        override fun getItemCount(): Int {
            return foodList.size
        }

        override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
            holder.title.text = foodList[position].Title

        }

        @SuppressLint("NotifyDataSetChanged")
        fun setList(list: List<DataFood>) {
            foodList = list
            notifyDataSetChanged()
        }
    }