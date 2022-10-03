package com.example.day1
fun main() {
    val name1 = false
    val name2 = false
    val name3 = name1 && name2
    val num1= 10
    val num2= 3
    val num3= num1%num2
    val num4= 5
    val num5= 5
    val num6= num4>=num5
    val name4 = false
    val name5 = true
    val name14 = name4 || name5
    val num7 = 5
    val num8= 3
    val num9= 2
    val num10 =num7-num8*num9
    val num11= num8 != num9
    val num12 =6
    val num13 =(num12+num12)/num8
    println("false && false= $name3")
    println("10 % 3= $num3")
    println("5 >= 5= $num14")
    println("false || true= $name6")
    println("5 - 3 * 2= $num10")
    println("3 != 2 $num11")
    println("(6 + 6) / 3= $num13")

}