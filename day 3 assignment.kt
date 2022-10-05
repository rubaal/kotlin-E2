package com.example.day3assignment

fun main() {
    var average=0.0
    var check= arrayListOf  (1.5, 2.3, 6.7, 2.4, 5.3)
    for (index in check)
    {
        average= average + index
    }
    val average2 = average / check.size-1
    println("The average is: $average2")
}
