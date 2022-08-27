package com.example.battleofthegenerations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.battleofthegenerations.databinding.ActivityCategoryViewBinding
import com.example.battleofthegenerations.models.AppConstants
//import com.example.battleofthegenerations.models.ImageBasedQuestionConstants.getAllImageBasedQuestions
import com.example.battleofthegenerations.views.ImageBasedActivity
import com.example.battleofthegenerations.views.LyricQuestionActivity
import com.example.battleofthegenerations.views.MultipleChoiceActivity

class CategoryView : AppCompatActivity() {

    private lateinit var binding: ActivityCategoryViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("username").toString()
        val sharedPref = getSharedPreferences("myPreferences", MODE_PRIVATE)
        val lastUser = sharedPref.getString(AppConstants.last_user, "No one")
        val boomerScore = sharedPref.getInt(AppConstants.boomer_score, 0)
        val millennialScore = sharedPref.getInt(AppConstants.millennial_score, 0)
        val genXScore = sharedPref.getInt(AppConstants.genX_score, 0)
        val genZScore = sharedPref.getInt(AppConstants.genZ_score, 0)

        binding.tvUsername.text = "Hello, $username!"

        binding.ivSettings.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        // Navigating to boomer Questions
        binding.catBoomer.setOnClickListener {
            val intent = Intent(this, LyricQuestionActivity::class.java)
            intent.putExtra("username", username)
            intent.putExtra("category", "boomer")
            startActivity(intent)
        }

        // Navigate to genX questions
        binding.catGenX.setOnClickListener{
            val intent = Intent(this, ImageBasedActivity::class.java)
            intent.putExtra("username", username)
            intent.putExtra("category", "gen_x")
            startActivity(intent)
        }

        binding.catMillennial.setOnClickListener {
            val intent = Intent(this, MultipleChoiceActivity::class.java)
            intent.putExtra("username", username)
            intent.putExtra("category", "millennial")
            startActivity(intent)
        }

        binding.catGenZ.setOnClickListener {
            val intent = Intent(this, ImageBasedActivity::class.java)
            intent.putExtra("username", username)
            intent.putExtra("category", "gen_z")
            startActivity(intent)
        }

        binding.allCategories.setOnClickListener {
            val intent = Intent(this, MultipleChoiceActivity::class.java)
            intent.putExtra("username", username)
            intent.putExtra("category", "all_categories")
            startActivity(intent)
        }
    }
}