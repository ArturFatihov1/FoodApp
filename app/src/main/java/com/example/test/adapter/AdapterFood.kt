package com.example.test.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.test.model.DataFood
import com.example.test.R
import com.example.test.fragments.MainFragmentDirections

class AdapterFood(private val foodList: List<DataFood>) :
    RecyclerView.Adapter<AdapterFood.UserViewHolder>() {


    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.textView)
        val button: Button = view.findViewById(R.id.button)

        init {
            button.setOnClickListener {
                val action = MainFragmentDirections.actionMainFragmentToDetailedFragment()
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
        holder.button.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToDetailedFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }


}

