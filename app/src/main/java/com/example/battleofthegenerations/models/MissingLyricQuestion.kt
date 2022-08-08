package com.example.battleofthegenerations.models

// data keyword = blueprint
data class MissingLyricQuestion (
    val id: Int,
    val questionText: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String
//    val answer: Int
)