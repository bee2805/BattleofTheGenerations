package com.example.battleofthegenerations.models

import com.example.battleofthegenerations.R

object GenXConstants {

    // this function returns all questions
    // this is where we will se all of our set questions
    fun getGenXLyricQuestions():ArrayList<MissingLyricQuestion>{

        val genXLyricQuestions = ArrayList<MissingLyricQuestion>()

        // Gen X
        // https://www.youtube.com/watch?v=Gcm-tOGiva0 - music vid screenshot
        val genXMissingLyric1 = MissingLyricQuestion(
            3,
            R.drawable.hero,
            "We don't need another _______, we don't need another way home.",
            "hero"
        )

        // https://www.youtube.com/watch?v=SsmVgoXDq2w - music vid screenshot
        val genXMissingLyric2 = MissingLyricQuestion(
            4,
            R.drawable.manic_monday,
            "It's just another __________ Monday.",
            "Manic"
        )

        genXLyricQuestions.add(genXMissingLyric1)
        genXLyricQuestions.add(genXMissingLyric2)
        return genXLyricQuestions

    } // end of gen X lyric questions

    fun getGenXMultipleChoice():ArrayList<MultipleChoice>{

        val genXMultipleChoiceQuestions = ArrayList<MultipleChoice>()

        // Gen X
        // https://www.buzzfeed.com/briangalindo/only-gen-xers-are-passing-this-quiz
        val genXMultipleChoice1 = MultipleChoice(
            4,
            R.drawable.lollapalooza,
            "What music festival started in the early 90's?",
            "Woodstock",
            "Lollapalooza",
            "Coachella",
            "Lollapalooza"
        )

        // https://www.buzzfeed.com/briangalindo/only-gen-xers-are-passing-this-quiz
        val genXMultipleChoice2 = MultipleChoice(
            5,
            R.drawable.cabbage_patch_kids,
            "In 1983, parents were literally fighting over what toy during the holiday season?",
            "Cabbage Patch Kids",
            "Care Bears",
            "Rubik's cubes",
            "Cabbage Patch Kids"
        )

        // https://www.goodhousekeeping.com/beauty/g3633/courteney-cox-then-and-now/
        val genXMultipleChoice3 = MultipleChoice(
            6,
            R.drawable.courteney_cox,
            "Prior to appearing on Friends, Courtney Cox was probably best known for her recurring role on what sitcom?",
            "Cheers",
            "Married with children",
            "Family Ties",
            "Family Ties"
        )

        genXMultipleChoiceQuestions.add(genXMultipleChoice1)
        genXMultipleChoiceQuestions.add(genXMultipleChoice2)
        genXMultipleChoiceQuestions.add(genXMultipleChoice3)
        return genXMultipleChoiceQuestions
    } // end of Gen X multiple choice questions

    fun getGenXImageBasedQuestions():ArrayList<ImageBasedQuestion>{

        val genXImageBasedQuestions = ArrayList<ImageBasedQuestion>()

        // https://www.buzzfeed.com/briangalindo/only-gen-xers-are-passing-this-quiz
        val genXImageBasedQuestion1 = ImageBasedQuestion(
            3,
            R.drawable.atari_2600,
            "What gaming console is this?",
            "Tomagotchi",
            "Game Boy",
            "Atari 2600",
            "Atari 2600"
        )

        // https://www.youtube.com/watch?v=djV11Xbc914 - screenshot from music video
        val genXImageBasedQuestion2 = ImageBasedQuestion(
            4,
            R.drawable.take_on_me_aha,
            "This is a scene from which music video?",
            "'Hold me now' by the Thomson Twins",
            "'Take on me' by A-Ha",
            "'I'm still standing' by Elton John",
            "Take on me' by A-Ha"
        )

        genXImageBasedQuestions.add(genXImageBasedQuestion1)
        genXImageBasedQuestions.add(genXImageBasedQuestion2)
        return genXImageBasedQuestions
    }

}