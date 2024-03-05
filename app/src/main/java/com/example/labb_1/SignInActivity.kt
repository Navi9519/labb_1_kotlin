package com.example.labb_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.labb_1.databinding.ActivitySignInBinding
import com.example.labb_1.models.User

class SignInActivity : AppCompatActivity() {
    private  lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val etUserName = binding.etUserName
        val etUserTeam = binding.etUserTeam
        val etSigIn = binding.etSignIn
        val userArray = mutableListOf<User>()


        etSigIn.setOnClickListener {

            val name = etUserName.text.toString()
            val team = etUserTeam.text.toString()
            val user = User(name, team)
            userArray.add(user)
            println(user.toString())


            val myIntent = Intent(this, LoggedInActivity::class.java).apply {
                putExtra("userArray", ArrayList(userArray))
            }
            startActivity(myIntent)



        }
    }
}