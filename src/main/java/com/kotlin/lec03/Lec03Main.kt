package com.kotlin.lec03


fun main() {

    val str1: String = "asdf"
    println("문자열 테스트 임다 : ${str1} 하하하")

    val str2: String = """
        
        안녕하세요
        
        감사합니다
        
        ${str1}
        안녕히가세요
    """.trimIndent()
    println(str2)
}
