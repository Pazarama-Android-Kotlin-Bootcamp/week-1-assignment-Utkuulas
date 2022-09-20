import java.util.Scanner

/*
* Code Username Validation Have the function Codeland Username Validation(str) take the str parameter being passed
and determine if the string is a valid username according to the following rules:
*
* 1-) The username is between 4 and 25 characters.
* 2-) It must start with a letter.
* 3-) It can only contain letters, numbers, and the underscore character.
* 4-) It cannot end with an underscore character. If the username is valid then your program should return the string true,
otherwise return the string false.
*
* Examples Input: "aa_" Output: false Input: "u__hello_world123"
*
* */

fun main() {
    val scanner = Scanner(System.`in`)

    println("Please type a username: ")

    val inputStr = scanner.next()

    println(CodelandUsernameValidation(inputStr))
}

fun CodelandUsernameValidation(str: String): Boolean {
    if (str.contains(Regex("\\W"))){
        return false
    }

    if (str.length < 4 || str.length > 25){
        return false
    }

    if (str.endsWith("_")){
        return false
    }

    if (str.startsWith("_") || Regex("\\d").containsMatchIn(str.take(1))){
        return false
    }

    return true
}

