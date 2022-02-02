package com.atul.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.atul.affirmations.adapter.ItemAdapter
import com.atul.affirmations.data.Datasource
import com.atul.affirmations.databinding.ActivityMainBinding
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //recyclerView
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        // initialize data
        val dataSet = Datasource().listOfAffirmation()
        // set Adapter
        binding.recyclerView.adapter = ItemAdapter(this@MainActivity,dataSet)
        binding.recyclerView.layoutManager = GridLayoutManager(this,2)
        //binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
    }
}