package com.example.battleofthegenerations.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.battleofthegenerations.databinding.ActivityLyricQuestionBinding
import com.example.battleofthegenerations.models.BoomerConstants.getBoomerLyricQuestions
import com.example.battleofthegenerations.models.MissingLyricQuestion

class LyricQuestionActivity : AppCompatActivity() {

    // define binding view
    private lateinit var binding: ActivityLyricQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // inflates activities binding into our content
        binding = ActivityLyricQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val currentCategory = intent.getStringExtra("category").toString()

        var questionNumber : Int = intent.getIntExtra("questionNumber", 0)

        when(currentCategory){
            "boomer"->{
                val lyricQuestions = getBoomerLyricQuestions()
                val currentQuestionNumber = lyricQuestions[questionNumber]
                updateUI(currentQuestionNumber)

                Log.i("Question", lyricQuestions[0].questionText)

                binding.btnNext.setOnClickListener{

                    val answer = binding.etAnswe.text
                    if("$answer" == currentQuestionNumber.answer){
                        val intent = Intent(this, LyricQuestionActivity::class.java)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("questionNumber", questionNumber + 1)
                        startActivity(intent)
                        finish()

                        if(questionNumber + 1 == lyricQuestions.count()){
                            val intent = Intent(this, MultipleChoiceActivity::class.java)
                            intent.putExtra("category", currentCategory)
                            startActivity(intent)
                        } else {
                            val intent = Intent(this, LyricQuestionActivity::class.java)
                            intent.putExtra("category", currentCategory)
                            intent.putExtra("questionNumber", questionNumber + 1)
                            startActivity(intent)
                            finish()
                        }

                    } else {
                        val intent = Intent(this, LyricQuestionActivity::class.java)
                        intent.putExtra("category", currentCategory)
                        intent.putExtra("questionNumber", questionNumber + 1)
                        startActivity(intent)
                        finish()
                    }
                }
            }
        }

    }
    fun updateUI (currentQuestion: MissingLyricQuestion){
        binding.tvLyricQuestion.text = currentQuestion.questionText
        binding.ivLyricImage.setImageResource(currentQuestion.questionImage)
    }
}

//