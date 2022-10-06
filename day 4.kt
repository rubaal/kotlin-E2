package com.example.day4

fun main(){
   cal(4.0,6.0,)
    cal(4.0,6.0,"*")
    cal(4.0,6.0,"/")
   cal(4.0,6.0,"-")

    val result = addition(2, 7)
    println(result)
    reverse(result)
}

fun addition(num1: Int, num2: Int): Boolean {
    return num1 > num2
}

fun reverse(a: Boolean) {
    val b = !a
    println(b)
}

fun cal (number1 :Double , number2 :Double , name :String= "+") {
when (name){
    "+"-> println ("add: ${number1 + number2}")
    "-"-> println("sub: ${number1 - number2}")
    "*"-> println("mul: ${number1 * number2}")
    "/"-> println("dev: ${number1 / number2}")
    else-> println("nothing")
}
}



