package com.example.test

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: AdapterFood
    lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
    }


    private fun initial() {
        recyclerView = binding.RcView
        adapter = AdapterFood()
        recyclerView.adapter = adapter
        adapter.setList(Food())
    }

    fun Food(): ArrayList<DataFood> {
        val foodlist = ArrayList<DataFood>()

        val card1 = DataFood("Том Ям","500 г")
        foodlist.add(card1)
        val card2 = DataFood("Название блюда","500 г")
        foodlist.add(card2)
        val card3 = DataFood("Название блюда","500 г")
        foodlist.add(card3)
        val card4 = DataFood("Название блюда","500 г")
        foodlist.add(card4)
        val card5 = DataFood("Название блюда","500 г")
        foodlist.add(card5)
        val card6 = DataFood("Название блюда","500 г")
        foodlist.add(card6)



        return foodlist
    }
}
