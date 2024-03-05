package com.example.labb_1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.labb_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView (view)

        val btnToAboutPage = binding.btnToAboutpage

        btnToAboutPage.setOnClickListener {
            val myIntent = Intent(this, AboutActivity::class.java)
            startActivity(myIntent)
        }
    }
}