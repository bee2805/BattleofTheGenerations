package com.example.battleofthegenerations

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.battleofthegenerations.databinding.ActivityMainBinding
import com.example.battleofthegenerations.databinding.ActivitySettingsBinding

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.icBack.setOnClickListener{
            val intent = Intent(this, CategoryView::class.java)
            startActivity(intent)
        }

        binding.github.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/bee2805/BattleofTheGenerations"))
            startActivity(intent)
        }

        binding.okBoomer.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://okboomer.game/"))
            startActivity(intent)
        }

    }
}