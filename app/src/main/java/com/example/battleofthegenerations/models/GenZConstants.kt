package com.example.battleofthegenerations.models

import com.example.battleofthegenerations.R

object GenZConstants {

    fun getGenZLyricQuestions():ArrayList<MissingLyricQuestion>{

        val genZLyricQuestions = ArrayList<MissingLyricQuestion>()

        // https://www.billboard.com/music/music-news/lil-nas-x-billy-ray-cyrus-old-town-road-music-video-1-billion-views-1235124943/
        val genZMissingLyric1 = MissingLyricQuestion(
            7,
            R.drawable.old_town_road,
            "I'm gonna take my _____ to the old town road.",
            "horse"
        )

        // https://www.youtube.com/watch?v=hT_nvWreIhg
        val genZMissingLyric2 = MissingLyricQuestion(
            8,
            R.drawable.counting_stars,
            "Old, but I'm not that old, young, but I'm not that _______.",
            "bold"
        )

        genZLyricQuestions.add(genZMissingLyric1)
        genZLyricQuestions.add(genZMissingLyric2)
        return genZLyricQuestions

    }

    fun getGenZMultipleChoiceQuestions():ArrayList<MultipleChoice>{

        val genZMultipleChoiceQuestions = ArrayList<MultipleChoice>()

        // https://www.buzzfeed.com/farrahpenn/these-trivia-questions-will-separate-gen-z-cuspers-from
        val genZMultipleChoice1 = MultipleChoice(
            R.drawable.lily_oliver,
            10,
            "What were the names of Miley's two best friends on Hannah Montanna?",
            "Oscar and Lola",
            "Lily and Oliver",
            "Edgar and Lila",
            "Lily and Oliver"
        )

        // https://www.tetongravity.com/forums/showthread.php/337421-Crazy-eyes-post-em-up
        val genZMultipleChoice2 = MultipleChoice(
            11,
            R.drawable.karen,
            "What does it mean to be a Karen?",
            "A person who can't spell",
            "A person who is considerate and respectful",
            "A person who will definitely ask to speak to the manager.",
            "A person who will definitely ask to speak to the manager."
        )

        // https://www.wikihow.com/What-Does-Smh-Mean
        val genZMultipleChoice3 = MultipleChoice(
            12,
            R.drawable.smh,
            "What does 'smh' stand for?",
            "Shaking my head",
            "So much hate",
            "Saving my heart",
            "Shaking my head"
        )

        genZMultipleChoiceQuestions.add(genZMultipleChoice1)
        genZMultipleChoiceQuestions.add(genZMultipleChoice2)
        genZMultipleChoiceQuestions.add(genZMultipleChoice3)
        return genZMultipleChoiceQuestions
    }

    fun getGenZImageBasedQuestions():ArrayList<ImageBasedQuestion>{

        val genZImageBasedQuestions = ArrayList<ImageBasedQuestion>()

        // https://mobile.twitter.com/daviddobrik - his profile pic on twitter
        val genZImageBasedQuestion1 = ImageBasedQuestion(
            7,
            R.drawable.david_dobrik,
            "Who is this?",
            "David Dobrik",
            "Harry Styles",
            "Shawn Mendes",
            "David Dobrik"
        )

        // https://en.wikipedia.org/wiki/Dab_%28dance%29
        val genZImageBasedQuestion2 = ImageBasedQuestion(
            8,
            R.drawable.dab,
            "What dance move is this?",
            "Dabbing",
            "flossing",
            "Twerking",
            "Dabbing"
        )

        genZImageBasedQuestions.add(genZImageBasedQuestion1)
        genZImageBasedQuestions.add(genZImageBasedQuestion2)
        return genZImageBasedQuestions
    }

}