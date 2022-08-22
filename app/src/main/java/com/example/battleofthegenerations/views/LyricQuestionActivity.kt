package com.example.battleofthegenerations.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.battleofthegenerations.R
import com.example.battleofthegenerations.databinding.ActivityLyricQuestionBinding
import com.example.battleofthegenerations.models.LyricQuestionConstants.getAllLyricQuestions

class LyricQuestionActivity : AppCompatActivity() {

    // define binding view
    private lateinit var binding: ActivityLyricQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // inflates activities binding into our content
        binding = ActivityLyricQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Call for all my questions
        var lyricQuestions = getAllLyricQuestions()

        Log.i("Lyric Question Count: ", "$lyricQuestions.size")

        binding.tvLyricQuestion.text = lyricQuestions[0].questionText
        binding.ivLyricImage.setImageResource(lyricQuestions[0].questionImage)
    }
}

//