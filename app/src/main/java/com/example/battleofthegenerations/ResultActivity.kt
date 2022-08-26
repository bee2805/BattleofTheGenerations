package com.example.battleofthegenerations

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.battleofthegenerations.databinding.ActivityMainBinding
import com.example.battleofthegenerations.databinding.ActivityResultBinding
import com.example.battleofthegenerations.databinding.ActivitySettingsBinding
import com.example.battleofthegenerations.models.BoomerConstants

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val currentCategory = intent.getStringExtra("category").toString()
        val finalScore : Int = intent.getIntExtra("score", 0)

        binding.tvFinalScore.text = "$finalScore/7"
        if (finalScore >= 4){
            binding.ivResultImage.setImageResource(R.drawable.success)
            binding.tvResultHeading.text = "Congratulations!!!"
            binding.tvMessage.text = "You have passed this Category!"
        } else {
            binding.ivResultImage.setImageResource(R.drawable.fail)
            binding.tvResultHeading.text = "Unlucky."
            binding.tvMessage.text = "Better luck next time."
        }

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        editor.apply{
            putString(BoomerConstants.last_user)
        }

        binding.btnHome.setOnClickListener {
            val intent = Intent(this, CategoryView::class.java)
            intent.putExtra("currentCategory", currentCategory)
            intent.putExtra("finalScore", finalScore)
            startActivity(intent)
            finish()
        }
    }
}