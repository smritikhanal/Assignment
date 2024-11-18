package com.example.week1

fun main(){
    var data = mapOf(
        "Animal" to "This is animal",
        "China" to "This is not the place I was born.",
        "Nepal" to "The place I was born.",
        "Softwarica" to "College of IT.",
    )
    println("Enter any word: ")
    var name : String = readln()
    println("The meaning is ${data[name]}")

}