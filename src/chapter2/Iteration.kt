package chapter2

import java.util.*

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "FizzBuzz"
    else-> "$i"
}

fun forExample() {
    for (i in 100 downTo 1 step 2) {
        println(fizzBuzz(i))
    }

    val binaryReps = TreeMap<Char, String>()
    for(c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    val list = arrayListOf("10", "11", "1001")
    for((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}