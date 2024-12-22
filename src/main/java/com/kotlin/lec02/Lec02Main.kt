package com.kotlin.lec02

fun main() {

    val str: String = "APPLE"
    println(startsWithA1(str))
    println(startsWithA2(str))
    println(startsWithA3(str))

//    println(startsWithA1(null))
    println(startsWithA2(null))
    println(startsWithA3(null))

}

fun startsWithA1(str: String?): Boolean {
//    if (str == null)
//        throw IllegalArgumentException("String cannot be null")
//
//    return str.startsWith("A")


    return str?.startsWith("A") ?: throw IllegalArgumentException()
}

fun startsWithA2(str: String?): Boolean? {
//    if (str == null)
//        return null
//
//    return str.startsWith("A")


    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
//    if (str == null)
//        return false
//
//    return str.startsWith("A")


    return str?.startsWith("A") ?: false
}
