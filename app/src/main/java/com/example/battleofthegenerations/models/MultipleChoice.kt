package com.example.battleofthegenerations.models

data class MultipleChoice (
    val id: Int,
    val questionImg: Int,
    val questionText: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val answer: String
)