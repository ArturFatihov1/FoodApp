package com.example.test

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterFood : RecyclerView.Adapter<AdapterFood.UserViewHolder>() {

    var foodList = emptyList<DataFood>()

    inner class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView
        val button: Button

        init {
            title = itemView.findViewById(R.id.textView)
            button = itemView.findViewById(R.id.button)
            button.setOnClickListener {
                val intent = Intent(it.context,SecondActivity::class.java)
                it.context.startActivity(intent)
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_food, parent, false)
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

