package com.example.battleofthegenerations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.battleofthegenerations.databinding.ActivityCategoryViewBinding
//import com.example.battleofthegenerations.models.ImageBasedQuestionConstants.getAllImageBasedQuestions
import com.example.battleofthegenerations.models.LyricQuestionConstants.getAllLyricQuestions
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

        binding.tvUsername.text = "Hello, $username!"

        binding.ivSettings.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        // Navigating to boomer Questions
        binding.catBoomer.setOnClickListener {
            val intent = Intent(this, LyricQuestionActivity::class.java)
            intent.putExtra("category", "boomer")
            startActivity(intent)
        }

        // Navigate to genX questions
        binding.catGenX.setOnClickListener{
            val intent = Intent(this, ImageBasedActivity::class.java)
            startActivity(intent)
        }

        binding.catMillennial.setOnClickListener {
            val intent = Intent(this, MultipleChoiceActivity::class.java)
            startActivity(intent)
        }

        binding.catGenZ.setOnClickListener {
            val intent = Intent(this, ImageBasedActivity::class.java)
            startActivity(intent)
        }
    }
}