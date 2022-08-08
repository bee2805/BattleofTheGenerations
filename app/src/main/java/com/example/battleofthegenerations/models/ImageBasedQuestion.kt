package com.example.battleofthegenerations.models

 data class ImageBasedQuestion (
        //TODO: Add Image
        val id: Int,
        // val questionImage: Int
        val questionText: String,
        val optionOne: String,
        val optionTwo: String,
        val optionThree: String
        //val answer: Int
)