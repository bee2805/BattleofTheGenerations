package com.example.battleofthegenerations.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.battleofthegenerations.CategoryView
import com.example.battleofthegenerations.ResultActivity
import com.example.battleofthegenerations.databinding.ActivityLyricQuestionBinding
import com.example.battleofthegenerations.models.BoomerConstants.getBoomerLyricQuestions
import com.example.battleofthegenerations.models.GenXConstants.getGenXLyricQuestions
import com.example.battleofthegenerations.models.GenZConstants.getGenZLyricQuestions
import com.example.battleofthegenerations.models.MillennialConstants.getMillennialLyricQuestions
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

        //set action bar

        when(currentCategory){
            "boomer"->{
                val lyricQuestions = getBoomerLyricQuestions()
                val currentQuestion = lyricQuestions[questionNumber]
                updateUI(currentQuestion)

                binding.btnNext.setOnClickListener{

                    val answer = binding.etAnswer.text

                    if("$answer" == ""){
                        binding.etAnswer.error = "Please add your Answer"
                    } else {
                        if("$answer" == currentQuestion.answer){
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
            "gen_x"->{
                val lyricQuestions = getGenXLyricQuestions()
                val currentQuestion = lyricQuestions[questionNumber]
                updateUI(currentQuestion)

                binding.btnNext.setOnClickListener {
                    val answer = binding.etAnswer.text

                    if("$answer" == ""){
                        binding.etAnswer.error = "Please add your Answer"
                    } else {
                        if ("$answer" == currentQuestion.answer){

                            val intent = Intent(this, LyricQuestionActivity::class.java)
                            intent.putExtra("category", currentCategory)
                            intent.putExtra("questionNumber", questionNumber + 1)
                            startActivity(intent)
                            finish()

                            if (questionNumber + 1 == lyricQuestions.count()){
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
            "millennial"->{
                val lyricQuestions = getMillennialLyricQuestions()
                val currentQuestion = lyricQuestions[questionNumber]
                updateUI(currentQuestion)

                binding.btnNext.setOnClickListener {
                    val answer = binding.etAnswer.text

                    if("$answer" == ""){
                        binding.etAnswer.error = "Please add your Answer"
                    } else {
                        if ("$answer" == currentQuestion.answer){

                            val intent = Intent(this, LyricQuestionActivity::class.java)
                            intent.putExtra("category", currentCategory)
                            intent.putExtra("questionNumber", questionNumber + 1)
                            startActivity(intent)
                            finish()

                            if (questionNumber + 1 == lyricQuestions.count()){
                                val intent = Intent(this, ResultActivity::class.java)
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
            "gen_z"->{
                val lyricQuestions = getGenZLyricQuestions()
                val currentQuestion = lyricQuestions[questionNumber]
                updateUI(currentQuestion)

                binding.btnNext.setOnClickListener {
                    val answer = binding.etAnswer.text

                    if("$answer" == ""){
                        binding.etAnswer.error = "Please add your Answer"
                    } else {
                        if ("$answer" == currentQuestion.answer){

                            val intent = Intent(this, LyricQuestionActivity::class.java)
                            intent.putExtra("category", currentCategory)
                            intent.putExtra("questionNumber", questionNumber + 1)
                            startActivity(intent)
                            finish()

                            if (questionNumber + 1 == lyricQuestions.count()){
                                val intent = Intent(this, ResultActivity::class.java)
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

    }
    fun updateUI (currentQuestion: MissingLyricQuestion){
        binding.tvLyricQuestion.text = currentQuestion.questionText
        binding.ivLyricImage.setImageResource(currentQuestion.questionImage)
        binding.progressBar.progress = currentQuestion.id
    }
}

//