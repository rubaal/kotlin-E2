package com.example.day2
fun main() {
    for (num in 0..100)
    {
        if (num!=71)
            println(num)
        else
            println("IT'S OVER 70!!!“")
    }
    var temperature= 35
    while (temperature<=35&& temperature>=10) {
        val num =when (temperature) {
            30 -> println("It’s Hot")
            20 -> println("It’s Comfy")
            15 -> println("IT'S COLD!!!")
            10 -> println(temperature)
            else -> println(temperature)
        }
        temperature --
    }
}