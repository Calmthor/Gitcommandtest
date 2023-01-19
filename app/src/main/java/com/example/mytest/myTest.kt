package com.example.mytest


class MyTest {
    fun main() {
        val number = myMax(1, 2)
        when {
            number == 1 -> println("a is bigger")
            else -> println("b is bigger")
        }
        for (i in 10 downTo 0 step 2)
            println(i)
    }
    fun myMax(a: Int, b: Int) = if (a > b) a else b
}
