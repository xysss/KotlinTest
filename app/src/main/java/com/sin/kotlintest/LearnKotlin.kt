package com.sin.kotlintest

import kotlin.math.max

fun main() {
    val a: Int = 10
    val b: Int = 20;
    for (i in 0 until 10 step  2){  //for in循环 until [)左闭右开
        print("large="+largerNumber(a, b))
        println("   core"+getScore("Tom"))
    }
    val s=Student("sno",20,"jack",19)
    s.eat()
    Singleton.singleletonTest()
}

fun largerNumber(num1: Int, num2: Int) = if (num1 > num2) num1 else num2

fun getScore(name:String)=when(name){
    "Tom"->86
    "jin"->80
    else ->0
}