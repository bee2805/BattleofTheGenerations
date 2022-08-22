package com.example.battleofthegenerations.models

import com.example.battleofthegenerations.R

object ImageBasedQuestionConstants {

    // this function returns all questions
    // this is where we will se all of our set questions

    fun getBoomerLyricQuestions():ArrayList<MissingLyricQuestion>{

        val boomerLyricQuestions = ArrayList<MissingLyricQuestion>()

        // Boomer
        // https://www.youtube.com/watch?v=j13oJajXx0M - music vid screenshot
        val boomerMissingLyric1 = MissingLyricQuestion(
            1,
            R.drawable.youre_so_vain,
            "You're so _________, you probably think this song is about you.",
            "vain"
        )

        // https://www.youtube.com/watch?v=QRoWiTcO7dk - screenshot from Mama Mia vid
        val boomerMissingLyric2 = MissingLyricQuestion(
            2,
            R.drawable.dancing_queen,
            "See that girl, watch that scene, __________ the dancing queen!",
            "Digging"
        )
        boomerLyricQuestions.add(boomerMissingLyric1)
        boomerLyricQuestions.add(boomerMissingLyric2)
        return boomerLyricQuestions
    }

    fun getBoomerMultipleChoiceQuestions():ArrayList<MultipleChoice>{

        val boomerMultipleChoiceQuestions = ArrayList<MultipleChoice>()

        val boomerMultipleChoice1 = MultipleChoice(
            1,
            R.drawable.woodstock,
            "What was the most iconic festival of the 1960's?",
            "Rocking the Daisies",
            "Woodstock",
            "Coachella"
        )

        // https://www.buzzfeed.com/sarahaspler/boomer-trivia-quiz
        val boomerMultipleChoice2 = MultipleChoice(
            2,
            R.drawable.sputnik,
            "What was the name of the first satellite launched into space",
            "Telstar",
            "Sputnik",
            "RadarSat"
        )

        // https://www.buzzfeed.com/sarahaspler/boomer-trivia-quiz
        val boomerMultipleChoice3 = MultipleChoice(
            3,
            R.drawable.beetlemania,
            "What was the term used to describe the rise of the Beetles?",
            "Beetlefever",
            "Beetlemania",
            "Beetlecraze"
        )
        return boomerMultipleChoiceQuestions
    }
}