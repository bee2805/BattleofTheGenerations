package com.example.battleofthegenerations.models

import com.example.battleofthegenerations.R

object LyricQuestionConstants {

    // this function returns all questions
    // this is where we will se all of our set questions
    fun getAllLyricQuestions() : ArrayList<MissingLyricQuestion> {

        // 1. Create empty array list
        val allLyricQuestions = ArrayList<MissingLyricQuestion>()

        // 2. Create Data
        // one lyric question PER category
        // for last category 'Which gen does your soul belong to', we add one belonging to each extra
        // IN ESSENCE, two lyric questions per generation.

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

        // Millennial
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

        // Gen Z
        // https://www.billboard.com/music/music-news/lil-nas-x-billy-ray-cyrus-old-town-road-music-video-1-billion-views-1235124943/
        val genZMissingLyric1 = MissingLyricQuestion(
            7,
            R.drawable.old_town_road,
            "I'm gonna take my _____ to the old town road.",
            "horse"
        )

        // counting stars
        // https://www.youtube.com/watch?v=hT_nvWreIhg
        val genZMissingLyric2 = MissingLyricQuestion(
            8,
            R.drawable.counting_stars,
            "Old, but I'm not that old, young, but I'm not that _______.",
            "bold"
        )

        // add questions to array
        allLyricQuestions.add(boomerMissingLyric1)
        allLyricQuestions.add(boomerMissingLyric2)
        allLyricQuestions.add(genXMissingLyric1)
        allLyricQuestions.add(genXMissingLyric2)
        allLyricQuestions.add(millennialMissingLyric1)
        allLyricQuestions.add(millennialMissingLyric2)
        allLyricQuestions.add(genZMissingLyric1)
        allLyricQuestions.add(genZMissingLyric2)

        // 3. Return data
        return allLyricQuestions
    }

}