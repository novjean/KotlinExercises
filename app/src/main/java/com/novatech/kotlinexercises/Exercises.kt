package com.novatech.kotlinexercises

import java.util.Scanner

fun main() {
    val s1 = Scanner(System.`in`)
    println("please enter two number")

    val num1 = s1.nextInt()
    val num2 = s1.nextInt()

    println("division result is " + num1 / num2)
    println("remainder is " + num1 % num2);
}