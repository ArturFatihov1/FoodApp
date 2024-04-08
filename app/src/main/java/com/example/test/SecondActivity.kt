package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Adapter
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.test.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: AdapterDetailedFood
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()

    }

    private fun initial() {
        recyclerView = binding.Recycler2
        adapter = AdapterDetailedFood()
        recyclerView.adapter = adapter
        adapter.setList(Food())
    }

    fun Food(): ArrayList<DataFood> {
        val foodLt = ArrayList<DataFood>()

        val card1 = DataFood("Вес","500 г")
        foodLt.add(card1)
        val card2 = DataFood("Энерг.ценность","198,9 ккал")
        foodLt.add(card2)
        val card3 = DataFood("Белки","10г")
        foodLt.add(card3)
        val card4 = DataFood("Жиры","8,5 г")
        foodLt.add(card4)
        val card5 = DataFood("Углеводы","19,7 г")
        foodLt.add(card5)



        return foodLt
    }
}

