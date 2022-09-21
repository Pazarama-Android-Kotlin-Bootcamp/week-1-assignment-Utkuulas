/*
* First Factorial Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it.
* For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24.
* For the test cases, the range will be between 1 and 18 and the input will always be an integer.
* Examples Input: 4 Output: 24 Input: 8 Output: 40320
* */

fun main() {
    println("Please type a number for calculate the factorial: ")

    val input = readln().toIntOrNull()            // Converts the input to an integer

    if (input != null && input >= 0) {            // Checks if the input is null
        println(FirstFactorial(input))
    } else {
        println("Invalid Value!")
    }
}

fun FirstFactorial(num: Int): Int {

    if (num >= 0) {
        var factorial = 1

        if (num > 0) {
            for (i in 1..num) {
                factorial *= i
            }
        }

        return factorial
    }

    return -1
}