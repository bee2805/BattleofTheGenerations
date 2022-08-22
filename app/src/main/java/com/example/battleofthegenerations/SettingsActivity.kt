package com.example.battleofthegenerations

import android.content.Intent
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
    }

//    public void boomer_website(View view){
//        intent
//    }

}