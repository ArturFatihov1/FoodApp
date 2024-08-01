package com.example.test.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.test.adapter.AdapterDetailedFood
import com.example.test.model.DataFood
import com.example.test.R
import com.example.test.databinding.FragmentDetailedBinding


class DetailedFragment : Fragment() {
    private lateinit var binding: FragmentDetailedBinding
    private lateinit var adapter: AdapterDetailedFood

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailedBinding.inflate(layoutInflater, container, false)

        initial()

        return binding.root
    }

    private fun initial() {
        adapter = AdapterDetailedFood(Food())
        binding.Recycler2.adapter = adapter

        binding.backArrow.setOnClickListener{
            findNavController().navigate(R.id.action_detailedFragment_to_mainFragment)
        }
    }

    private fun Food(): ArrayList<DataFood> {
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