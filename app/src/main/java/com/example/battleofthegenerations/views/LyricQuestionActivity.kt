package com.example.battleofthegenerations.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.battleofthegenerations.R
import com.example.battleofthegenerations.models.LyricQuestionConstants.getAllLyricQuestions

class LyricQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lyric_question)

        // Call for all my questions
        var lyricQuestions = getAllLyricQuestions()

        Log.i("Lyric Question Count: ", "$lyricQuestions.size")
    }
}