package com.example.test.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.test.adapter.AdapterFood
import com.example.test.model.DataFood
import com.example.test.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private lateinit var adapter: AdapterFood

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)

        initial()


        return binding.root
    }


    private fun initial() {
        adapter = AdapterFood(Food())
        binding.RcView.adapter = adapter
    }

    private fun Food(): ArrayList<DataFood> {
        val foodlist = ArrayList<DataFood>()

        val card1 = DataFood("Том Ям", "500 г")
        foodlist.add(card1)
        val card2 = DataFood("Название блюда", "500 г")
        foodlist.add(card2)
        val card3 = DataFood("Название блюда", "500 г")
        foodlist.add(card3)
        val card4 = DataFood("Название блюда", "500 г")
        foodlist.add(card4)
        val card5 = DataFood("Название блюда", "500 г")
        foodlist.add(card5)
        val card6 = DataFood("Название блюда", "500 г")
        foodlist.add(card6)

        return foodlist
    }
}