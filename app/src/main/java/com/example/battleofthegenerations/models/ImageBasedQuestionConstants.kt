package com.example.battleofthegenerations.models

object ImageBasedQuestionConstants {

    // this function returns all questions
    // this is where we will se all of our set questions
    fun getAllImageBasedQuestions() : ArrayList<ImageBasedQuestion>{

        // 1. Create empty array list
        val allImageBasedQuestions = ArrayList<ImageBasedQuestion>()

        // 2. create the data
        // 2 per generation for this one.

        //TODO: Get images for questions.

        //boomer
        val boomerImageBasedQuestion1 = ImageBasedQuestion(
            1,
            "Can you remember the name of this puppet show?",
            "Archie Andrews",
            "Howdy Dowdy",
            "Chuckles"
        )

        val boomerImageBasedQuestion2 = ImageBasedQuestion(
            2,
            "What style pants are these?",
            "Flare",
            "Bell Bottoms",
            "Boot-cut"
        )

        // Gen X
        val genXImageBasedQuestion1 = ImageBasedQuestion(
            3,
            "What gaming console is this?",
            "Tomagotchi",
            "Game Boy",
            "Atari 2600"
        )

        val genXImageBasedQuestion2 = ImageBasedQuestion(
            4,
            "This is a scene from which music video?",
            "'Hold me now' by the Thomson Twins",
            "'Take on me' by A-Ha",
            "'I'm still standing' by Elton John"
        )

        //Millennial
        val millennialImageBasedQuestion1 = ImageBasedQuestion(
            5,
            "What Phone is this?",
            "Sidekick",
            "LG GT360",
            "Razr"
        )

        val millennialImageBasedQuestion2 = ImageBasedQuestion(
            6,
            "What is this tou called?",
            "Poo-Chi",
            "Robo Doggo",
            "Barkie Bot"
        )

        // Gen Z
        val genZImageBasedQuestion1 = ImageBasedQuestion(
            7,
            "Who is this?",
            "David Dobrik",
            "Harry Styles",
            "Shawn Mendes"
        )

        val genZImageBasedQuestion2 = ImageBasedQuestion(
            8,
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