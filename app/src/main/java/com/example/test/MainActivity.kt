package com.example.test

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.test.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: AdapterFood
    lateinit var recyclerView: RecyclerView
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initial()
        //navigation drawer

        val navView: NavigationView = findViewById(R.id.navigationView)
        drawerLayout = findViewById(R.id.drawerLayout)
        toggle = ActionBarDrawerToggle(this@MainActivity, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            it.isChecked = true
            when(it.itemId){
                R.id.basket -> replaceFragment(BlankFragment(),it.title.toString())
            }
            true
        }
    }
    fun replaceFragment(fragment: Fragment, title:String){
        var fragmentManager = supportFragmentManager
        var fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_1,fragment)
        fragmentTransaction.commit()
        drawerLayout.closeDrawers()
        setTitle(title)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item))return true
        return super.onOptionsItemSelected(item)
    }
    private fun initial() {
        recyclerView = binding.RcView
        adapter = AdapterFood()
        recyclerView.adapter = adapter
        adapter.setList(Food())
    }

    fun Food(): ArrayList<DataFood> {
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
