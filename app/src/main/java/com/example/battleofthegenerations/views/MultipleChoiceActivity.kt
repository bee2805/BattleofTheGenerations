package com.example.battleofthegenerations.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.battleofthegenerations.R
import com.example.battleofthegenerations.databinding.ActivityImageBasedBinding
import com.example.battleofthegenerations.databinding.ActivityLyricQuestionBinding
import com.example.battleofthegenerations.databinding.ActivityMultipleChoiceBinding
import com.example.battleofthegenerations.models.LyricQuestionConstants
import com.example.battleofthegenerations.models.MultipleChoiceConstants

class MultipleChoiceActivity : AppCompatActivity() {

    // define binding view
    private lateinit var binding: ActivityMultipleChoiceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // inflates activities binding into our content
        binding = ActivityMultipleChoiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Call for all my questions
        var multipleChoiceQuestions = MultipleChoiceConstants.getAllMultipleChoiceQuestions()

        Log.i("Multiple Choice Count: ", "$multipleChoiceQuestions.size")

        binding.tvMultipleChoiceQuestion.text = multipleChoiceQuestions[0].questionText
    }
}