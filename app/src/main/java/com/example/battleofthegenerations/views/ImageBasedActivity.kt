package com.example.battleofthegenerations.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.battleofthegenerations.CategoryView
import com.example.battleofthegenerations.databinding.ActivityImageBasedBinding
import com.example.battleofthegenerations.models.BoomerConstants.getBoomerImageBasedQuestions
import com.example.battleofthegenerations.models.ImageBasedQuestion

class ImageBasedActivity : AppCompatActivity() {

    // define binding view
    private lateinit var binding: ActivityImageBasedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // inflates activities binding into our content
        binding = ActivityImageBasedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val currentCategory = intent.getStringExtra("category").toString()
        var questionNumber : Int = intent.getIntExtra("imageBasedQuestions", 0)

        when(currentCategory){
            "boomer"->{
                val questions = getBoomerImageBasedQuestions()
                val currentQuestion = questions[questionNumber]
                updateUI(currentQuestion)

                binding.tvOptionOne.setOnClickListener{
                    if(binding.tvOptionOne.text == currentQuestion.answer){
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("imageBasedQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("imageBasedQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }

                    if (questionNumber + 1 == questions.count()){
                        // TODO: navigate to the results screen
                        val intent = Intent(this, CategoryView::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("imageBasedQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.tvOptionTwo.setOnClickListener {
                    if(binding.tvOptionTwo.text == currentQuestion.answer){
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("imageBasedQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("imageBasedQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }

                    if (questionNumber + 1 == questions.count()){
                        // TODO: navigate to the results screen
                        val intent = Intent(this, CategoryView::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("imageBasedQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }
                }

                binding.tvOptionThree.setOnClickListener {
                    if (binding.tvOptionThree.text == currentQuestion.answer){
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("imageBasedQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("imageBasedQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }

                    if (questionNumber + 1 == questions.count()){
                        // TODO: navigate to the results screen
                        val intent = Intent(this, CategoryView::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("imageBasedQuestions", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }
                }
            }
        }
    }

    fun updateUI(currentQuestion: ImageBasedQuestion){
        binding.ivIbQues.setImageResource(currentQuestion.questionImage)
        binding.tvImageQuestion.text = currentQuestion.questionText
        binding.tvOptionOne.text = currentQuestion.optionOne
        binding.tvOptionTwo.text = currentQuestion.optionTwo
        binding.tvOptionThree.text = currentQuestion.optionThree
    }
}