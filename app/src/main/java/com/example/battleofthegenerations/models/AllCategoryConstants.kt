package com.example.battleofthegenerations.models

import com.example.battleofthegenerations.R

object AllCategoryConstants {

    fun getAllCategoryQuestions():ArrayList<MultipleChoice>{

        val allCategoryQuestions = ArrayList<MultipleChoice>()

//        Boomer
        // https://www.buzzfeed.com/sarahaspler/boomer-trivia-quiz
        val multipleChoice1 = MultipleChoice(
            1,
            R.drawable.woodstock,
            "What was the most iconic festival of the 1960's?",
            "Woodstock",
            "Rocking the Daisies",
            "Coachella",
            "Woodstock"
        )

        // https://www.buzzfeed.com/sarahaspler/boomer-trivia-quiz
        val multipleChoice2 = MultipleChoice(
            2,
            R.drawable.beetlemania,
            "What was the term used to describe the rise of the Beetles?",
            "Beetlefever",
            "Beetlecraze",
            "Beetlemania",
            "Beetlemania"
        )

        // Gen X
        // https://www.buzzfeed.com/briangalindo/only-gen-xers-are-passing-this-quiz
        val multipleChoice3 = MultipleChoice(
            3,
            R.drawable.lollapalooza,
            "What music festival started in the early 90's?",
            "Woodstock",
            "Lollapalooza",
            "Coachella",
            "Lollapalooza"
        )

        // https://www.buzzfeed.com/briangalindo/only-gen-xers-are-passing-this-quiz
        val multipleChoice4 = MultipleChoice(
            4,
            R.drawable.cabbage_patch_kids,
            "In 1983, parents were literally fighting over what toy during the holiday season?",
            "Cabbage Patch Kids",
            "Care Bears",
            "Rubik's cubes",
            "Cabbage Patch Kids"
        )

        // millennial
        // https://www.wired.com/story/tamagotchi-25-year-anniversary-impact/
        val multipleChoice5 = MultipleChoice(
            5,
            R.drawable.tomagotchi,
            "What egg-shaped device/game released in 1996 allowed you to take care of a pet?",
            "Game boy",
            "My Pocket Pet",
            "Tomagotchi",
            "Tomagotchi"
        )

        // https://www.revolvermag.com/culture/see-beavis-and-butt-head-get-middle-aged-new-paramount-movie
        val multipleChoice6 = MultipleChoice(
            6,
            R.drawable.beavis,
            "What Band is featured on Beavis' shirt in Beavis and Butt-Head",
            "Metallica",
            "Nirvana",
            "Guns n Roses",
            "Metallica"
        )

        // https://www.buzzfeed.com/farrahpenn/these-trivia-questions-will-separate-gen-z-cuspers-from
        val multipleChoice7 = MultipleChoice(
            7,
            R.drawable.lily_oliver,
            "What were the names of Miley's two best friends on Hannah Montanna?",
            "Oscar and Lola",
            "Lily and Oliver",
            "Edgar and Lila",
            "Lily and Oliver"
        )

        // https://www.tetongravity.com/forums/showthread.php/337421-Crazy-eyes-post-em-up
        val multipleChoice8 = MultipleChoice(
            8,
            R.drawable.karen,
            "What does it mean to be a Karen?",
            "A person who can't spell",
            "A person who is considerate and respectful",
            "A person who will definitely ask to speak to the manager",
            "A person who will definitely ask to speak to the manager"
        )

        allCategoryQuestions.add(multipleChoice1)
        allCategoryQuestions.add(multipleChoice2)
        allCategoryQuestions.add(multipleChoice3)
        allCategoryQuestions.add(multipleChoice4)
        allCategoryQuestions.add(multipleChoice5)
        allCategoryQuestions.add(multipleChoice6)
        allCategoryQuestions.add(multipleChoice7)
        allCategoryQuestions.add(multipleChoice8)
        return allCategoryQuestions

    }
}