package com.example.battleofthegenerations.models

object MultipleChoiceConstants {

    // this function returns all questions
    // this is where we will se all of our set questions
    fun getAllMultipleChoiceQuestions() : ArrayList<MultipleChoice> {

        // 1. Create empty array list
        val allLMultipleChoiceQuestions = ArrayList<MultipleChoice>()

        // 2. create the data
        // 3 per generation for this one.

        //TODO: Get images for questions.

        //boomer
        val boomerMultipleChoice1 = MultipleChoice(
            1,
            "What was the most iconic festival of the 1960's?",
            "Rocking the Daisies",
            "Woodstock",
            "Coachella"
        )

        val boomerMultipleChoice2 = MultipleChoice(
            2,
            "What was the name of the first satellite launched into space",
            "Dusty Springfield",
            "Petula Clark",
            "Nancy Sinatra"
        )

        val boomerMultipleChoice3 = MultipleChoice(
            3,
            "What was the term used to describe the rise of the Beetles?",
            "Beetlefever",
            "Beetlemania",
            "Beetlecraze"
        )

        // Gen X
        val genXMultipleChoice1 = MultipleChoice(
            4,
            "What music festival started in the early 90's?",
            "Woodstock",
            "Lollapalooza",
            "Coachella"
        )

        val genXMultipleChoice2 = MultipleChoice(
            5,
            "In 1983, parents were literally fighting over what toy during the holiday season?",
            "Cabbage Patch Kids",
            "Care Bears",
            "Rubik's cubes"
        )

        val genXMultipleChoice3 = MultipleChoice(
            6,
            "Prior to appearing on Friends, Courtney Cox was probably best known for her recurring role on what sitcom?",
            "Cheers",
            "Married with children",
            "Family Ties"
        )

        // Millennial
        val millennialMultipleChoice1 = MultipleChoice(
            7,
            "Which dating show would provide weird facts about the contestants as they walked off of a bus?",
            "Singled Out",
            "Next",
            "Dismissed"
        )

        val millennialMultipleChoice2 = MultipleChoice(
            8,
            "What egg-shaped device/game released in 1996 allowed you to take care of a pet?",
            "Game boy",
            "My Pocket Pet",
            "Tomagotchi"
        )

        val millennialMultipleChoice3 = MultipleChoice(
            9,
            "What Band is featured on Beavis' shirt in Beavis and Butt-Head",
            "Metallica",
            "Nirvana",
            "Guns n Roses"
        )

        // Gen Z
        val genZMultipleChoice1 = MultipleChoice(
            10,
            "What were the names of Miley's two best friends on Hannah Montanna?",
            "Oscar and Lola",
            "Lily and Oliver",
            "Edgar and Lila"
        )

        val genZMultipleChoice2 = MultipleChoice(
            11,
            "What does it mean to be a Karen?",
            "A person who can't spell",
            "A person who is considerate and respectful",
            "A hoity toity person who will definitely ask to speak to the manager."
        )

        val genZMultipleChoice3 = MultipleChoice(
            12,
            "What does 'smh' stand for?",
            "Shaking my head",
            "So much hate",
            "Saving my heart"
        )

        // add questions to array
        allLMultipleChoiceQuestions.add(boomerMultipleChoice1)
        allLMultipleChoiceQuestions.add(boomerMultipleChoice2)
        allLMultipleChoiceQuestions.add(boomerMultipleChoice3)

        allLMultipleChoiceQuestions.add(genXMultipleChoice1)
        allLMultipleChoiceQuestions.add(genXMultipleChoice2)
        allLMultipleChoiceQuestions.add(genXMultipleChoice3)

        allLMultipleChoiceQuestions.add(millennialMultipleChoice1)
        allLMultipleChoiceQuestions.add(millennialMultipleChoice2)
        allLMultipleChoiceQuestions.add(millennialMultipleChoice3)

        allLMultipleChoiceQuestions.add(genZMultipleChoice1)
        allLMultipleChoiceQuestions.add(genZMultipleChoice2)
        allLMultipleChoiceQuestions.add(genZMultipleChoice3)

        return allLMultipleChoiceQuestions
    }

}