package com.example.battleofthegenerations.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.battleofthegenerations.R
import com.example.battleofthegenerations.databinding.ActivityImageBasedBinding
import com.example.battleofthegenerations.databinding.ActivityLyricQuestionBinding
import com.example.battleofthegenerations.models.ImageBasedQuestionConstants

class ImageBasedActivity : AppCompatActivity() {

    // define binding view
    private lateinit var binding: ActivityImageBasedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // inflates activities binding into our content
        binding = ActivityImageBasedBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
//        // Call for all my questions
//        val imageQuestions = ImageBasedQuestionConstants.getAllImageBasedQuestions()
//
//        Log.i("Lyric Question Count: ", "$imageQuestions.size")
//
//        binding.tvImageQuestion.text = imageQuestions[3].questionText
//        binding.ivIbQues.setImageResource(imageQuestions[3].questionImage)
//        binding.tvOptionOne.text = imageQuestions[3].optionOne
//        binding.tvOptionTwo.text = imageQuestions[3].optionTwo
//        binding.tvOptionThree.text = imageQuestions[3].optionThree
    }
}