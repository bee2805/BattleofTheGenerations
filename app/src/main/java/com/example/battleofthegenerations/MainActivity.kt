package com.example.battleofthegenerations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
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
            Log.i("Clicked: ", "$username")

            // checking if it is empty
            if(username.toString() == ""){
                //var toast = Toast.makeText(this, "Please enter your username", Toast.LENGTH_LONG).show()
                binding.etUsername.error = "Please add a username."
            }else{
                //TODO: Navigate to next activity
            }

        }

    }
}