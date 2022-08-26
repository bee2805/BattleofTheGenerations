package com.example.battleofthegenerations.models

import com.example.battleofthegenerations.R

object BoomerConstants {

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
            "digging"
        )
        boomerLyricQuestions.add(boomerMissingLyric1)
        boomerLyricQuestions.add(boomerMissingLyric2)
        return boomerLyricQuestions
    }

    fun getBoomerMultipleChoiceQuestions():ArrayList<MultipleChoice>{

        val boomerMultipleChoiceQuestions = ArrayList<MultipleChoice>()

        // https://www.buzzfeed.com/sarahaspler/boomer-trivia-quiz
        val boomerMultipleChoice1 = MultipleChoice(
            3,
            R.drawable.woodstock,
            "What was the most iconic festival of the 1960's?",
            "Woodstock",
            "Rocking the Daisies",
            "Coachella",
            "Woodstock"
        )

        // https://www.buzzfeed.com/sarahaspler/boomer-trivia-quiz
        val boomerMultipleChoice2 = MultipleChoice(
            4,
            R.drawable.sputnik,
            "What was the name of the first satellite launched into space",
            "Telstar",
            "Sputnik",
            "RadarSat",
            "Sputnik"
        )

        // https://www.buzzfeed.com/sarahaspler/boomer-trivia-quiz
        val boomerMultipleChoice3 = MultipleChoice(
            5,
            R.drawable.beetlemania,
            "What was the term used to describe the rise of the Beetles?",
            "Beetlefever",
            "Beetlecraze",
            "Beetlemania",
            "Beetlemania"
        )

        boomerMultipleChoiceQuestions.add(boomerMultipleChoice1)
        boomerMultipleChoiceQuestions.add(boomerMultipleChoice2)
        boomerMultipleChoiceQuestions.add(boomerMultipleChoice3)
        return boomerMultipleChoiceQuestions
    }

    fun getBoomerImageBasedQuestions():ArrayList<ImageBasedQuestion>{

        val boomerImageBasedQuestions = ArrayList<ImageBasedQuestion>()

        val boomerImageBasedQuestion1 = ImageBasedQuestion(
            6,
            R.drawable.howdy_dowdy,
            "Can you remember the name of this puppet show?",
            "Archie Andrews",
            "Chuckles",
            "Howdy Dowdy",
            "Howdy Dowdy"
        )

        // https://www.insider.com/jeans-over-the-years-2018-8
        val boomerImageBasedQuestion2 = ImageBasedQuestion(
            7,
            R.drawable.bell_bottoms,
            "What style pants are these?",
            "Flare",
            "Bell Bottoms",
            "Boot-cut",
            "Bell Bottoms"
        )

        boomerImageBasedQuestions.add(boomerImageBasedQuestion1)
        boomerImageBasedQuestions.add(boomerImageBasedQuestion2)
        return boomerImageBasedQuestions
    }
}