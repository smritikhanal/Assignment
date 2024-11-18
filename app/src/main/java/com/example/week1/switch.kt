package com.example.week1

fun displayList(){
    val numbers : List<String> = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.size}")
    println("Fourth element: ${numbers.get(2)}")
    println("Index of element \"two\"${numbers.indexOf("two")}")
}
