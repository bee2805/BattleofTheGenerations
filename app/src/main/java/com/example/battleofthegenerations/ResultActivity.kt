package com.example.battleofthegenerations

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.battleofthegenerations.databinding.ActivityMainBinding
import com.example.battleofthegenerations.databinding.ActivityResultBinding
import com.example.battleofthegenerations.databinding.ActivitySettingsBinding
import com.example.battleofthegenerations.models.AppConstants
import com.example.battleofthegenerations.models.BoomerConstants

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("username").toString()
        val currentCategory = intent.getStringExtra("category").toString()
        val finalScore : Int = intent.getIntExtra("score", 0)

        binding.tvFinalScore.text = "$finalScore/7"
        if (finalScore >= 4){
            binding.ivResultImage.setImageResource(R.drawable.success)
            binding.tvResultHeading.text = "Congratulations!!!"
            binding.tvMessage.text = "You have passed this Category!"
            binding.tvFinalScore.setTextColor(Color.parseColor("#77a822"))
        } else {
            binding.ivResultImage.setImageResource(R.drawable.fail)
            binding.tvResultHeading.text = "Unlucky."
            binding.tvMessage.text = "Better luck next time."
            binding.tvFinalScore.setTextColor(Color.parseColor("#D1403F"))
        }

        when(currentCategory){
            "boomer"->{
                setBoomerHighScore(username, finalScore)
            }
            "gen_x"->{
                setGenXHighScore(username, finalScore)
            }
            "millennial"->{
                setMillennialHighScore(username,finalScore)
            }
            "gen_z"->{
                setGenZHighScore(username,finalScore)
            }
        }

        binding.btnHome.setOnClickListener {
            setBoomerHighScore(username, finalScore)
            setGenXHighScore(username, finalScore)
            setMillennialHighScore(username,finalScore)
            setGenZHighScore(username,finalScore)
            val intent = Intent(this, CategoryView::class.java)
            intent.putExtra("username", username)
            intent.putExtra("currentCategory", currentCategory)
            intent.putExtra("finalScore", finalScore)
            startActivity(intent)
            finish()
        }
    }
    private fun setBoomerHighScore(username: String, result: Int){
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        editor.apply{
            putString(AppConstants.username, username)
            putInt(AppConstants.last_boomer_score, result)
            apply()
        }
    }

    private fun setGenXHighScore(username: String, result: Int){
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        editor.apply{
            putString(AppConstants.username, username)
            putInt(AppConstants.last_genX_score, result)
            apply()
        }
    }

    private fun setMillennialHighScore(username: String, result: Int){
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        editor.apply{
            putString(AppConstants.username, username)
            putInt(AppConstants.millennial_score, result)
            apply()
        }
    }

    private fun setGenZHighScore(username: String, result: Int){
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        editor.apply{
            putString(AppConstants.username, username)
            putInt(AppConstants.last_genZ_score, result)
            apply()
        }
    }
}