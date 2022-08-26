package com.example.battleofthegenerations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.battleofthegenerations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Getting access to button when clicked.
        binding.btnStart.setOnClickListener {
            // functionality.onClick

            // getting input value
            val username = binding.etUsername.text

            // checking if it is empty
            if(username.toString() == ""){
                binding.etUsername.error = "Please add a username."
            }else{
                //intent navigation
                val intent = Intent(this, CategoryView::class.java)
                intent.putExtra("username", username.toString())
                startActivity(intent)
            }
        }
    }
}