//package com.example.battleofthegenerations.models
//
//import com.example.battleofthegenerations.R
//
//object MultipleChoiceConstants {
//
//    // this function returns all questions
//    // this is where we will se all of our set questions
//    fun getAllMultipleChoiceQuestions() : ArrayList<MultipleChoice> {
//
//        // 1. Create empty array list
//        val allLMultipleChoiceQuestions = ArrayList<MultipleChoice>()
//
//        // 2. create the data
//        // 3 per generation for this one.
//
//        // Boomer
//        // https://www.buzzfeed.com/sarahaspler/boomer-trivia-quiz
//        val boomerMultipleChoice1 = MultipleChoice(
//            1,
//            R.drawable.woodstock,
//            "What was the most iconic festival of the 1960's?",
//            "Rocking the Daisies",
//            "Woodstock",
//            "Coachella",
//            "Woodstock"
//        )
//
//        // https://www.buzzfeed.com/sarahaspler/boomer-trivia-quiz
//        val boomerMultipleChoice2 = MultipleChoice(
//            2,
//            R.drawable.sputnik,
//            "What was the name of the first satellite launched into space",
//            "Telstar",
//            "Sputnik",
//            "RadarSat"
//        )
//
//        // https://www.buzzfeed.com/sarahaspler/boomer-trivia-quiz
//        val boomerMultipleChoice3 = MultipleChoice(
//            3,
//            R.drawable.beetlemania,
//            "What was the term used to describe the rise of the Beetles?",
//            "Beetlefever",
//            "Beetlemania",
//            "Beetlecraze"
//        )
//
//        // Gen X
//        // https://www.buzzfeed.com/briangalindo/only-gen-xers-are-passing-this-quiz
//        val genXMultipleChoice1 = MultipleChoice(
//            4,
//            R.drawable.lollapalooza,
//            "What music festival started in the early 90's?",
//            "Woodstock",
//            "Lollapalooza",
//            "Coachella"
//        )
//
//        // https://www.buzzfeed.com/briangalindo/only-gen-xers-are-passing-this-quiz
//        val genXMultipleChoice2 = MultipleChoice(
//            5,
//            R.drawable.cabbage_patch_kids,
//            "In 1983, parents were literally fighting over what toy during the holiday season?",
//            "Cabbage Patch Kids",
//            "Care Bears",
//            "Rubik's cubes"
//        )
//
//        // https://www.goodhousekeeping.com/beauty/g3633/courteney-cox-then-and-now/
//        val genXMultipleChoice3 = MultipleChoice(
//            6,
//            R.drawable.courteney_cox,
//            "Prior to appearing on Friends, Courtney Cox was probably best known for her recurring role on what sitcom?",
//            "Cheers",
//            "Married with children",
//            "Family Ties"
//        )
//
//        // Millennial
//        // https://www.buzzfeed.com/lyapalater/ridiculous-facts-mtv-next-dating-show
//        val millennialMultipleChoice1 = MultipleChoice(
//            7,
//            R.drawable.next,
//            "Which dating show would provide weird facts about the contestants as they walked off of a bus?",
//            "Singled Out",
//            "Next",
//            "Dismissed"
//        )
//
//        // https://www.wired.com/story/tamagotchi-25-year-anniversary-impact/
//        val millennialMultipleChoice2 = MultipleChoice(
//            8,
//            R.drawable.tomagotchi,
//            "What egg-shaped device/game released in 1996 allowed you to take care of a pet?",
//            "Game boy",
//            "My Pocket Pet",
//            "Tomagotchi"
//        )
//
//        // https://www.revolvermag.com/culture/see-beavis-and-butt-head-get-middle-aged-new-paramount-movie
//        val millennialMultipleChoice3 = MultipleChoice(
//            9,
//            R.drawable.beavis,
//            "What Band is featured on Beavis' shirt in Beavis and Butt-Head",
//            "Metallica",
//            "Nirvana",
//            "Guns n Roses"
//        )
//
//        // Gen Z
//        // https://www.buzzfeed.com/farrahpenn/these-trivia-questions-will-separate-gen-z-cuspers-from
//        val genZMultipleChoice1 = MultipleChoice(
//            R.drawable.lily_oliver,
//            10,
//            "What were the names of Miley's two best friends on Hannah Montanna?",
//            "Oscar and Lola",
//            "Lily and Oliver",
//            "Edgar and Lila"
//        )
//
//        // https://www.tetongravity.com/forums/showthread.php/337421-Crazy-eyes-post-em-up
//        val genZMultipleChoice2 = MultipleChoice(
//            11,
//            R.drawable.karen,
//            "What does it mean to be a Karen?",
//            "A person who can't spell",
//            "A person who is considerate and respectful",
//            "A person who will definitely ask to speak to the manager."
//        )
//
//        // https://www.wikihow.com/What-Does-Smh-Mean
//        val genZMultipleChoice3 = MultipleChoice(
//            12,
//            R.drawable.smh,
//            "What does 'smh' stand for?",
//            "Shaking my head",
//            "So much hate",
//            "Saving my heart"
//        )
//
//        // add questions to array
//        allLMultipleChoiceQuestions.add(boomerMultipleChoice1)
//        allLMultipleChoiceQuestions.add(boomerMultipleChoice2)
//        allLMultipleChoiceQuestions.add(boomerMultipleChoice3)
//
//        allLMultipleChoiceQuestions.add(genXMultipleChoice1)
//        allLMultipleChoiceQuestions.add(genXMultipleChoice2)
//        allLMultipleChoiceQuestions.add(genXMultipleChoice3)
//
//        allLMultipleChoiceQuestions.add(millennialMultipleChoice1)
//        allLMultipleChoiceQuestions.add(millennialMultipleChoice2)
//        allLMultipleChoiceQuestions.add(millennialMultipleChoice3)
//
//        allLMultipleChoiceQuestions.add(genZMultipleChoice1)
//        allLMultipleChoiceQuestions.add(genZMultipleChoice2)
//        allLMultipleChoiceQuestions.add(genZMultipleChoice3)
//
//        return allLMultipleChoiceQuestions
//    }
//
//}