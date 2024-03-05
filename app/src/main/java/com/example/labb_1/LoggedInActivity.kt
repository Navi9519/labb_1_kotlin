package com.example.labb_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.labb_1.databinding.ActivityAboutBinding
import com.example.labb_1.databinding.ActivityLoggedInBinding
import com.example.labb_1.models.Team
import com.example.labb_1.models.User

class LoggedInActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityLoggedInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoggedInBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView (view)

        val tvLogInMessage = binding.tvLoginMessage
        val tvTeam = binding.tvTeam
        val tvStadium = binding.tvStadium
        val tvTitle = binding.tvTitles
        val receivedUserArray = intent.getSerializableExtra("userArray") as? ArrayList<User>

        if (receivedUserArray != null) {
            val name = receivedUserArray[0].userName
            val team = receivedUserArray[0].userTeam

            tvLogInMessage.text = "Hello ${name}, your team is ${team} "

            if (receivedUserArray[0].userTeam.equals("Hammarby", ignoreCase = true) ||
                receivedUserArray[0].userTeam.equals("HIF", ignoreCase = true))  {

                binding.root.setBackgroundResource(R.drawable.hammarby_colors)

             val HIF = Team("Hammarby", "Tele 2", 1)

                tvTeam.text = "Lag: ${HIF.teamName}"
                tvStadium.text = "Arena: ${HIF.stadium}"
                tvTitle.text = "Titlar: ${HIF.titles}"



         } else if (receivedUserArray[0].userTeam.equals("AIK", ignoreCase = true))  {

                binding.root.setBackgroundResource(R.drawable.aik_colors)

                val AIK = Team("AIK", "National arenan", 11)

                tvTeam.text = "Lag: ${AIK.teamName}"
                tvStadium.text = "Arena: ${AIK.stadium}"
                tvTitle.text = "Titlar: ${AIK.titles}"


            } else if (receivedUserArray[0].userTeam.equals("Djurgården", ignoreCase = true) ||
                receivedUserArray[0].userTeam.equals("DIF", ignoreCase = true))  {

                binding.root.setBackgroundResource(R.drawable.djurgarden_colors)

                val DIF = Team("Djurgården", "Tele 2", 11)
                tvTeam.text = "Lag: ${DIF.teamName}"
                tvStadium.text = "Arena: ${DIF.stadium}"
                tvTitle.text = "Titlar: ${DIF.titles}"


            }


            }
        }


    }
