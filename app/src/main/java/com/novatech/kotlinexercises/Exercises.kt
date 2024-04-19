package com.novatech.kotlinexercises

import java.util.Scanner

fun main() {

    //areaAndPerimeterOfCircle()
    //swapTwoVariables()
    //countCharacterTypes()
    //reverseString()
    //multiplyTwoArray()
    //countEvenOdd()
    greatestOfThree()

}

fun greatestOfThree(){
    val sc = Scanner(System.`in`)
    println("enter three numbers")

    var arr1 = mutableListOf<Int>()
    for(i in 0..2){
        arr1.add(sc.nextInt())
    }

    var greatest = arr1[0]
    for(i in 1..2){
        if(arr1[i]>greatest){
            greatest = arr1[i]
        }
    }

    println("greatest: $greatest")
}

fun countEvenOdd(){
    val sc = Scanner(System.`in`)
    println("enter length of array")
    var len = sc.nextInt()

    var arr1 = mutableListOf<Int>()
    println("enter values into array")
    for(i in 0..len-1){
        arr1.add(sc.nextInt())
    }

    var evenCount = 0;
    var oddCount = 0;
    for(item in arr1){
        if(item%2 ==0){
            evenCount++
        } else {
            oddCount++
        }
    }

    println("evens : $evenCount odds: $oddCount")

}

fun multiplyTwoArray(){
    val sc = Scanner(System.`in`)
    println("enter length of array")
    var len = sc.nextInt()

    var arr1 = mutableListOf<Int>()
    println("enter values for 1st array")
    for(i in 0..len-1){
        arr1.add(sc.nextInt())
    }

    var arr2 = mutableListOf<Int>()
    var arr3 = mutableListOf<Int>()
    println("enter values for 2nd array")
    for(i in 0..len-1){
        arr2.add(sc.nextInt())
        arr3.add(arr2[i]* arr1[i])
    }

    println("result is " + arr3)
//    for(i in 0..len-1){
//        println(arr3[i])
//    }
}

fun reverseString(){
    val sc = Scanner(System.`in`)
    println("enter string")
    val line = sc.nextLine()
    //println("line reversed: " + line.reversed())

    var letters = line.toCharArray()

    var reverse = ""
    for(i in letters.size-1 downTo 0){
        reverse += letters[i]
    }
    println("reversed line: " + reverse)


}

fun countCharacterTypes() {
    val sc = Scanner(System.`in`)
    println("enter the text")
    val text= sc.nextLine()

    var letterCount = 0
    var digitCount = 0
    var spaceCount = 0
    var otherCount = 0

    val chars = text.toCharArray()

    for(c in chars){
        if(Character.isLetter(c)){
            letterCount++
        } else if (Character.isDigit(c)){
            digitCount++
        } else if(Character.isSpaceChar(c)){
            spaceCount++
        } else {
            otherCount++
        }
    }

    println("letters: " + letterCount + " digitCount: " + digitCount
     + " space: " + spaceCount + " others: " + otherCount)
}

fun swapTwoVariables() {
    val sc = Scanner(System.`in`)
    println("enter two variables")
    var x = sc.nextInt()
    var y = sc.nextInt()
    var temp = y
    y = x
    x = temp
    println("x is "+ x)
    println("y is " + y)
}

fun areaAndPerimeterOfCircle(){
    val sc = Scanner(System.`in`)
    println("enter the radius")
    val radius = sc.nextInt()

    println("radius is " + (Math.PI * (radius*radius)))
    println("perimeter is " + (2*Math.PI* radius))

}

fun divisionAndRemainder(){
    val s1 = Scanner(System.`in`)
    println("please enter two number")

    val num1 = s1.nextInt()
    val num2 = s1.nextInt()

    println("division result is " + num1 / num2)
    println("remainder is " + num1 % num2);
}