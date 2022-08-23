package com.example.battleofthegenerations.models

import com.example.battleofthegenerations.R

object MillennialConstants {

    // this function returns all questions
    // this is where we will se all of our set questions
    fun getMillennialLyricQuestions():ArrayList<MissingLyricQuestion>{

        val millennialLyricQuestions = ArrayList<MissingLyricQuestion>()

        // https://www.youtube.com/watch?v=gGdGFtwCNBE - music vid screenshot
        val millennialMissingLyric1 = MissingLyricQuestion(
            5,
            R.drawable.mr_brightside,
            "Jealousy, turning ______ into the sea.",
            "saints"
        )

        // https://www.antimusic.com/news/2021/April/13Train_Receive_Diamond_Award_For_Hey,_Soul_Sister.shtml
        val millennialMissingLyric2 = MissingLyricQuestion(
            6,
            R.drawable.hey_soul_sister,
            "Hey soul sister, ain't that Mr. ______ on the radio, stereo, the way you move ain't fair you know.",
            "Mister"
        )

        millennialLyricQuestions.add(millennialMissingLyric1)
        millennialLyricQuestions.add(millennialMissingLyric2)
        return millennialLyricQuestions

    }

    fun getMillennialMultipleChoiceQuestions():ArrayList<MultipleChoice>{

        val millennialMultipleChoiceQuestions = ArrayList<MultipleChoice>()

        // https://www.buzzfeed.com/lyapalater/ridiculous-facts-mtv-next-dating-show
        val millennialMultipleChoice1 = MultipleChoice(
            7,
            R.drawable.next,
            "Which dating show would provide weird facts about the contestants as they walked off of a bus?",
            "Singled Out",
            "Next",
            "Dismissed",
            "next"
        )

        // https://www.wired.com/story/tamagotchi-25-year-anniversary-impact/
        val millennialMultipleChoice2 = MultipleChoice(
            8,
            R.drawable.tomagotchi,
            "What egg-shaped device/game released in 1996 allowed you to take care of a pet?",
            "Game boy",
            "My Pocket Pet",
            "Tomagotchi",
            "Tomagotchi"
        )

        // https://www.revolvermag.com/culture/see-beavis-and-butt-head-get-middle-aged-new-paramount-movie
        val millennialMultipleChoice3 = MultipleChoice(
            9,
            R.drawable.beavis,
            "What Band is featured on Beavis' shirt in Beavis and Butt-Head",
            "Metallica",
            "Nirvana",
            "Guns n Roses",
            "Metallica"
        )

        millennialMultipleChoiceQuestions.add(millennialMultipleChoice1)
        millennialMultipleChoiceQuestions.add(millennialMultipleChoice2)
        millennialMultipleChoiceQuestions.add(millennialMultipleChoice3)
        return millennialMultipleChoiceQuestions
    }

    fun getMillennialImageBasedQuestions():ArrayList<ImageBasedQuestion>{

        val millennialImageBasedQuestions = ArrayList<ImageBasedQuestion>()

        // https://www.buzzfeed.com/briangalindo/easy-2000s-trivia-quiz-for-millennials
        val millennialImageBasedQuestion1 = ImageBasedQuestion(
            5,
            R.drawable.sidekick,
            "What Phone is this?",
            "Sidekick",
            "LG GT360",
            "Razr",
            "Sidekick"
        )

        // https://www.youtube.com/watch?v=3G1pwUe4MvA - screenshot from ad
        val millennialImageBasedQuestion2 = ImageBasedQuestion(
            6,
            R.drawable.poo_chi,
            "What is this toy called?",
            "Poo-Chi",
            "Robo Doggo",
            "Barkie Bot",
            "Poo-Chi"
        )

        millennialImageBasedQuestions.add(millennialImageBasedQuestion1)
        millennialImageBasedQuestions.add(millennialImageBasedQuestion2)
        return millennialImageBasedQuestions
    }

}