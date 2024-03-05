package com.example.labb_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.labb_1.databinding.ActivityAboutBinding
import com.example.labb_1.models.User

class AboutActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView (view)

     
     
        val btnGoToLogIn = binding.btnGoToLogIn



        btnGoToLogIn.setOnClickListener {

            val myIntent = Intent(this, SignInActivity::class.java)
            startActivity(myIntent)



        }
    }
}