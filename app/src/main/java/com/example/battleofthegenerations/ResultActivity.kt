package com.example.battleofthegenerations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.battleofthegenerations.databinding.ActivityMainBinding
import com.example.battleofthegenerations.databinding.ActivityResultBinding
import com.example.battleofthegenerations.databinding.ActivitySettingsBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHome.setOnClickListener {
            val intent = Intent(this, CategoryView::class.java)
            startActivity(intent)
            finish()
        }
    }
}