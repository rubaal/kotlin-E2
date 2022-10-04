package com.example.day2

fun main() {
        var num= 0
    for (num in 0..100)
    {
        if (num!=71)
            println(num)
        else
            println("IT'S OVER 70!!!“")
    }

        var temperature= 35
    while (temperature<=35) {
        when (temperature) {
            30 -> println("It’s Hot")
            20 -> println("It’s Comfy")
            15 -> println("IT'S COLD!!!")
            10 -> println(temperature)
        }
            temperature --
    }


}