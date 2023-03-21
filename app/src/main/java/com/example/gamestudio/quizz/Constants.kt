package com.example.gamestudio.quizz

import com.example.gamestudio.R

object Constants {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "What is this flower's name ?",
            R.drawable.rose,
            arrayListOf("Daffodil", "rose", "Carnation", "Marigold"),
            1,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "What is this flower's name ?",
            R.drawable.sunflower,
            arrayListOf("Rose", "Lily",
            "Tulip", "Sunflower"),
            3
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "What is this flower's name ?",
            R.drawable.tulips,
            arrayListOf("Peony", "Carnation",
            "Tulip", "Orchid"),
            2
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "What is this flower's name ?",
            R.drawable.daisy,
            arrayListOf("Daffodil", "Daisy",
            "Carnation", "Marigold"),
            1
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "What is this flower's name ?",
            R.drawable.peonies,
            arrayListOf("Orchid", "Sunflower",
            "Rose", "Peony"),
            3
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "What is this flower's name ?",
            R.drawable.lily,
            arrayListOf("Lily", "Daffodil",
            "Peony", "Orchid"),
            0
        )

        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "What is this flower's name ?",
            R.drawable.daffodils,
            arrayListOf("Daffodil", "Peony",
            "Rose", "Lily"),
            0
        )
        questionsList.add(questionSeven)

        // 8
        val questionEight = Question(
            8,
            "What is this flower's name ?",
            R.drawable.carnation,
            arrayListOf("Carnation", "Peony",
            "Lily", "Tulip"),
            0
        )
        questionsList.add(questionEight)

        // 9
        val questionNine = Question(
            9,
            "What is this flower's name ?",
            R.drawable.marigold,
            arrayListOf("Daffodil", "Peony",
            "Orchid", "Marigold"),
            3
        )
        questionsList.add(questionNine)

        // 10
        val questionTen = Question(
            10,
            "What is this flower's name ?",
            R.drawable.orchid,
            arrayListOf("Carnation", "none of these",
            "Orchid", "Peony"),
            2
        )
        questionsList.add(questionTen)

        return questionsList
    }
}