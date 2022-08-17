package com.example.battleofthegenerations.models

import com.example.battleofthegenerations.R

object ImageBasedQuestionConstants {

    // this function returns all questions
    // this is where we will se all of our set questions
    fun getAllImageBasedQuestions() : ArrayList<ImageBasedQuestion>{

        // 1. Create empty array list
        val allImageBasedQuestions = ArrayList<ImageBasedQuestion>()

        // 2. create the data
        // 2 per generation for this one.

        // Boomer
        // https://www.flickr.com/photos/nhsalumni/3244836799/sizes/m/in/photostream/
        val boomerImageBasedQuestion1 = ImageBasedQuestion(
            1,
            R.drawable.howdy_dowdy,
            "Can you remember the name of this puppet show?",
            "Archie Andrews",
            "Howdy Dowdy",
            "Chuckles"
        )

        // https://www.insider.com/jeans-over-the-years-2018-8
        val boomerImageBasedQuestion2 = ImageBasedQuestion(
            2,
            R.drawable.bell_bottoms,
            "What style pants are these?",
            "Flare",
            "Bell Bottoms",
            "Boot-cut"
        )

        // Gen X
        // https://www.buzzfeed.com/briangalindo/only-gen-xers-are-passing-this-quiz
        val genXImageBasedQuestion1 = ImageBasedQuestion(
            3,
            R.drawable.atari_2600,
            "What gaming console is this?",
            "Tomagotchi",
            "Game Boy",
            "Atari 2600"
        )

        // https://www.youtube.com/watch?v=djV11Xbc914 - screenshot from music video
        val genXImageBasedQuestion2 = ImageBasedQuestion(
            4,
            R.drawable.take_on_me_aha,
            "This is a scene from which music video?",
            "'Hold me now' by the Thomson Twins",
            "'Take on me' by A-Ha",
            "'I'm still standing' by Elton John"
        )

        // Millennial
        // https://www.buzzfeed.com/briangalindo/easy-2000s-trivia-quiz-for-millennials
        val millennialImageBasedQuestion1 = ImageBasedQuestion(
            5,
            R.drawable.sidekick,
            "What Phone is this?",
            "Sidekick",
            "LG GT360",
            "Razr"
        )

        // https://www.youtube.com/watch?v=3G1pwUe4MvA - screenshot from ad
        val millennialImageBasedQuestion2 = ImageBasedQuestion(
            6,
            R.drawable.poo_chi,
            "What is this toy called?",
            "Poo-Chi",
            "Robo Doggo",
            "Barkie Bot"
        )

        // Gen Z
        // https://mobile.twitter.com/daviddobrik - his profile pic on twitter
        val genZImageBasedQuestion1 = ImageBasedQuestion(
            7,
            R.drawable.david_dobrik,
            "Who is this?",
            "David Dobrik",
            "Harry Styles",
            "Shawn Mendes"
        )

        // https://en.wikipedia.org/wiki/Dab_%28dance%29
        val genZImageBasedQuestion2 = ImageBasedQuestion(
            8,
            R.drawable.dab,
            "What dance move is this?",
            "Dabbing",
            "flossing",
            "Twerking"
        )

        allImageBasedQuestions.add(boomerImageBasedQuestion1)
        allImageBasedQuestions.add(boomerImageBasedQuestion2)
        allImageBasedQuestions.add(genXImageBasedQuestion1)
        allImageBasedQuestions.add(genXImageBasedQuestion2)
        allImageBasedQuestions.add(millennialImageBasedQuestion1)
        allImageBasedQuestions.add(millennialImageBasedQuestion2)
        allImageBasedQuestions.add(genZImageBasedQuestion1)
        allImageBasedQuestions.add(genZImageBasedQuestion2)

        return allImageBasedQuestions
    }
}