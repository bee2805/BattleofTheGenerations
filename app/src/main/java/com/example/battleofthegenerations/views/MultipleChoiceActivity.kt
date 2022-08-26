package com.example.battleofthegenerations.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.battleofthegenerations.CategoryView
import com.example.battleofthegenerations.ResultActivity
import com.example.battleofthegenerations.databinding.ActivityMultipleChoiceBinding
import com.example.battleofthegenerations.models.*
import com.example.battleofthegenerations.models.BoomerConstants.getBoomerMultipleChoiceQuestions
import com.example.battleofthegenerations.models.GenXConstants.getGenXMultipleChoice
import com.example.battleofthegenerations.models.GenZConstants.getGenZMultipleChoiceQuestions
import com.example.battleofthegenerations.models.MillennialConstants.getMillennialMultipleChoiceQuestions
import java.util.*

class MultipleChoiceActivity : AppCompatActivity() {

    // define binding view
    private lateinit var binding: ActivityMultipleChoiceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // inflates activities binding into our content
        binding = ActivityMultipleChoiceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra("username").toString()
        val currentCategory = intent.getStringExtra("category").toString()
        var questionNumber : Int = intent.getIntExtra("multipleChoiceQuestions", 0)
        var score : Int = intent.getIntExtra("score", 0)

        when(currentCategory){

            "boomer"->{
                val questions = getBoomerMultipleChoiceQuestions()
                val currentQuestion = questions[questionNumber]
                updateUI(currentQuestion)

                binding.tvOptionOne.setOnClickListener{
                    if (binding.tvOptionOne.text == currentQuestion.answer){
                        score += 1

                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }

                    if(questionNumber + 1 == questions.count()){
                        val intent = Intent(this, ImageBasedActivity::class.java)
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("score", score)
                        startActivity(intent)
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.tvOptionTwo.setOnClickListener {
                    if(binding.tvOptionTwo.text == currentQuestion.answer){
                        score += 1

                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }

                    if(questionNumber + 1 == questions.count()){
                        val intent = Intent(this, ImageBasedActivity::class.java)
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("score", score)
                        startActivity(intent)
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.tvOptionThree.setOnClickListener {
                    if (binding.tvOptionThree.text == currentQuestion.answer) {
                        score += 1

                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                    }

                    if(questionNumber + 1 == questions.count()){
                        val intent = Intent(this, ImageBasedActivity::class.java)
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("score", score)
                        startActivity(intent)
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
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
                        score += 1

                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }

                    if(questionNumber + 1 == genXQuestions.count()){
                        val intent = Intent(this, ResultActivity::class.java)
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("score", score)
                        startActivity(intent)
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.tvOptionTwo.setOnClickListener {
                    if(binding.tvOptionTwo.text == currentQuestion.answer){
                        score += 1

                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }
                    if(questionNumber + 1 == genXQuestions.count()){
                        val intent = Intent(this, ResultActivity::class.java)
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("score", score)
                        startActivity(intent)
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.tvOptionThree.setOnClickListener {
                    if (binding.tvOptionThree.text == currentQuestion.answer){
                        score += 1

                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }

                    if(questionNumber + 1 == genXQuestions.count()){
                        val intent = Intent(this, ResultActivity::class.java)
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("score", score)
                        startActivity(intent)
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }
                }
            }

            "millennial"->{
                val millennialQuestions = getMillennialMultipleChoiceQuestions()
                val currentQuestion = millennialQuestions[questionNumber]
                updateUI(currentQuestion)

                binding.tvOptionOne.setOnClickListener {

                    if (binding.tvOptionThree.text == currentQuestion.answer){
                        score += 1

                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }

                    if(questionNumber + 1 == millennialQuestions.count()){
                        val intent = Intent(this, ImageBasedActivity::class.java)
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("score", score)
                        startActivity(intent)
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.tvOptionTwo.setOnClickListener {

                    if (binding.tvOptionTwo.text == currentQuestion.answer){
                        score += 1

                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }

                    if(questionNumber + 1 == millennialQuestions.count()){
                        val intent = Intent(this, ImageBasedActivity::class.java)
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("score", score)
                        startActivity(intent)
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.tvOptionThree.setOnClickListener {

                    if (binding.tvOptionThree.text == currentQuestion.answer){
                        score += 1

                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }

                    if(questionNumber + 1 == millennialQuestions.count()){
                        val intent = Intent(this, ImageBasedActivity::class.java)
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("score", score)
                        startActivity(intent)
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }
                }
            }

            "gen_z"->{
                Log.i("success", currentCategory)
                val genZQuestions = getGenZMultipleChoiceQuestions()
                val currentQuestion = genZQuestions[questionNumber]
                updateUI(currentQuestion)
//
                binding.tvOptionOne.setOnClickListener {
                    if (binding.tvOptionOne.text == currentQuestion.answer){
                        score += 1

                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }

                    if(questionNumber + 1 == genZQuestions.count()){
                        val intent = Intent(this, LyricQuestionActivity::class.java)
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("score", score)
                        startActivity(intent)
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.tvOptionTwo.setOnClickListener {
                    if (binding.tvOptionTwo.text == currentQuestion.answer){
                        score += 1

                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }

                    if(questionNumber + 1 == genZQuestions.count()){
                        val intent = Intent(this, LyricQuestionActivity::class.java)
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("score", score)
                        startActivity(intent)
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.tvOptionThree.setOnClickListener {
                    if (binding.tvOptionThree.text == currentQuestion.answer){
                        score += 1

                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }

                    if(questionNumber + 1 == genZQuestions.count()){
                        val intent = Intent(this, LyricQuestionActivity::class.java)
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("score", score)
                        startActivity(intent)
                    } else {
                        intent.putExtra("username", username)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("multipleChoiceQuestions", questionNumber + 1)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }
                }
            }
        }
    }

    private fun updateUI (currentQuestion: MultipleChoice){
        binding.tvMultipleChoiceQuestion.text = currentQuestion.questionText
        binding.ivMcImage.setImageResource(currentQuestion.questionImg)
        binding.tvOptionOne.text = currentQuestion.optionOne
        binding.tvOptionTwo.text = currentQuestion.optionTwo
        binding.tvOptionThree.text = currentQuestion.optionThree
        binding.progressBar.progress = currentQuestion.id
        binding.tvProgress.text = currentQuestion.id.toString() + "/7"
    }
}