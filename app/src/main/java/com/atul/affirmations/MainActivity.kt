package com.atul.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.atul.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val numbers = listOf(1,2,4,5,6,7,8)
        println("$numbers")
        val mutList = mutableListOf(12,34)
        mutList.add(23)
        mutList.remove(12)
        print("$mutList")


    }
}