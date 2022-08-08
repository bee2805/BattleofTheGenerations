package com.example.battleofthegenerations.models

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

        // boomer
        val boomerMissingLyric1 = MissingLyricQuestion(
            1,
            "You're so _________, you probably think this song is about you.",
            "vain",
            "self-centered",
            "cool"
        )

        val boomerMissingLyric2 = MissingLyricQuestion(
            2,
            "See that girl, watch that scene, __________ the dancing queen!",
            "We are",
            "Digging",
            "Dig in"
        )

        // Gen X
        val genXMissingLyric1 = MissingLyricQuestion(
            3,
            "We don't need another _______, we don't need another way home.",
            "hero",
            "house",
            "churro"
        )

        val genXMissingLyric2 = MissingLyricQuestion(
            4,
            "It's just another __________ Monday.",
            "Sunday",
            "Funday",
            "Monday"
        )

        // Millennial
        val millennialMissingLyric1 = MissingLyricQuestion(
            5,
            "Jealousy, turning ______ into the sea.",
            "saints",
            "paint",
            "grain"
        )

        val millennialMissingLyric2 = MissingLyricQuestion(
            6,
            "Hey soul sister, ain't that Mr. ______ on the radio, stereo, the way you move ain't fair you know.",
            "Twister",
            "Mister",
            "Blister"
        )

        // Gen Z
        val genZMissingLyric1 = MissingLyricQuestion(
            7,
            "I'm gonna take my _____ to the hotel room.",
            "cash",
            "hoe",
            "horse"
        )

        val genZMissingLyric2 = MissingLyricQuestion(
            8,
            "Old, but I'm not that old, young, but I'm not that _______.",
            "cold",
            "bold",
            "mold"
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