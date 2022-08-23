package com.example.battleofthegenerations.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.battleofthegenerations.CategoryView
import com.example.battleofthegenerations.databinding.ActivityMultipleChoiceBinding
import com.example.battleofthegenerations.models.*
import com.example.battleofthegenerations.models.BoomerConstants.getBoomerMultipleChoiceQuestions
import com.example.battleofthegenerations.models.GenXConstants.getGenXMultipleChoice
import java.util.*

class MultipleChoiceActivity : AppCompatActivity() {

    // define binding view
    private lateinit var binding: ActivityMultipleChoiceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // inflates activities binding into our content
        binding = ActivityMultipleChoiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val currentCategory = intent.getStringExtra("category").toString()
        var questionNumber : Int = intent.getIntExtra("multipleChoiceQuestions", 0)

        when(currentCategory){
            "boomer"->{
                val questions = getBoomerMultipleChoiceQuestions()
                val currentQuestion = questions[questionNumber]
                updateUI(currentQuestion)

                binding.tvOptionOne.setOnClickListener{
                    if (binding.tvOptionOne.text == currentQuestion.answer){
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }

                    if(questionNumber + 1 == questions.count()){
                        val intent = Intent(this, ImageBasedActivity::class.java)
                        intent.putExtra("category", currentCategory)
                        startActivity(intent)
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.tvOptionTwo.setOnClickListener {
                    if(binding.tvOptionTwo.text == currentQuestion.answer){
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }

                    if(questionNumber + 1 == questions.count()){
                        val intent = Intent(this, ImageBasedActivity::class.java)
                        intent.putExtra("category", currentCategory)
                        startActivity(intent)
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.tvOptionThree.setOnClickListener {
                    if (binding.tvOptionThree.text == currentQuestion.answer) {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                    }

                    if(questionNumber + 1 == questions.count()){
                        val intent = Intent(this, ImageBasedActivity::class.java)
                        intent.putExtra("category", currentCategory)
                        startActivity(intent)
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }
                }

            }
            "gen_x"->{
                val genXQuestions = getGenXMultipleChoice()
                val currentQuestion = genXQuestions[questionNumber]
                updateUI(currentQuestion)

                binding.tvOptionOne.setOnClickListener {
                    if (binding.tvOptionOne.text == currentQuestion.answer){
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }

                    if(questionNumber + 1 == genXQuestions.count()){
                        //TODO: Navigate to the results screen
                        val intent = Intent(this, CategoryView::class.java)
                        startActivity(intent)
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.tvOptionTwo.setOnClickListener {
                    if(binding.tvOptionTwo.text == currentQuestion.answer){
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }
                    if(questionNumber + 1 == genXQuestions.count()){
                        //TODO: Navigate to the results screen
                        val intent = Intent(this, CategoryView::class.java)
                        startActivity(intent)
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.tvOptionThree.setOnClickListener {
                    if (binding.tvOptionThree.text == currentQuestion.answer){
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }
                    if(questionNumber + 1 == genXQuestions.count()){
                        //TODO: Navigate to the results screen
                        val intent = Intent(this, CategoryView::class.java)
                        startActivity(intent)
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }
                }
            }
        }
    }

    fun updateUI (currentQuestion: MultipleChoice){
        binding.tvMultipleChoiceQuestion.text = currentQuestion.questionText
        binding.ivMcImage.setImageResource(currentQuestion.questionImg)
        binding.tvOptionOne.text = currentQuestion.optionOne
        binding.tvOptionTwo.text = currentQuestion.optionTwo
        binding.tvOptionThree.text = currentQuestion.optionThree
    }
}