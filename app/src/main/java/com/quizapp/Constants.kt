package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {


    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "რომელი მანქანაა გამოსახული სურათზე?",
            R.drawable.supra,
            "Toyota supra", "BMW Z4",
            "Toyota prius", "არცერთი", 1
        )

        questionsList.add(que1)

        val que2 = Question(
            2, "რომელი მანქანაა გამოსახული სურათზე?",
            R.drawable.r34,
            "Mercedes-benz clk", "Toyota altezza",
            "Nissan skyline R34", "არც ერთი", 3
        )

        questionsList.add(que2)

        val que3 = Question(
            3, "რომელი მანქანის ლოგოა სურათზე?",
            R.drawable.lincoln,
            "Saab", "GMC",
            "Tesla", "Lincoln", 4
        )

        questionsList.add(que3)

        val que4 = Question(
            4, "რომელი მანქანის ლოგოა სურათზე?",
            R.drawable.koenig,
            "Bugatti", "Koenigsegg",
            "Pagani", "არც ერთი", 2
        )

        questionsList.add(que4)

        val que5 = Question(
            5, "რომელი მანქანაა გამოსახული სურათზე?",
            R.drawable.f90,
            "Mercedes-benz Cls55", "BMW m3 E30",
            "BMW M5 F90", "BMW m5 F10", 3
        )

        questionsList.add(que5)

        val que6 = Question(
            6, "რომელ ქვეყანას ეკუთვნის მოცემული მარკა?",
            R.drawable.lancia,
            "იტალია", "გერმანია",
            "საფრანგეთი", "არც ერთი", 1
        )

        questionsList.add(que6)

        val que7 = Question(
            7, "რომელი კომპანია ფლობს მოცემულ ბრენდს?",
            R.drawable.lexus,
            "KIA", "Nissan",
            "Toyota", "არც ერთი", 3
        )

        questionsList.add(que7)


        val que8 = Question(
            8, "დაასახელეთ მოცემული დეტალი",
            R.drawable.turbo,
            "ჰაერის ფილტრი", "სტარტერი",
            "კომპრესორი", "ტურბინა", 4
        )

        questionsList.add(que8)

        val que9 = Question(
            9, "დაასახელეთ მოცემული დეტალი?",
            R.drawable.starter,
            "სტარტერი", "ზეთის ფილტრი",
            "კატალიზატორი", "არც ერთი", 1
        )

        questionsList.add(que9)

        val que10 = Question(
            10, "რას ნიშნავს JDM?",
            R.drawable.jdm,
            "Japanese domain market", "Japan Date machine",
            "არც ერთი", "Japanese domestic market", 4
        )

        questionsList.add(que10)

        return questionsList
    }
}