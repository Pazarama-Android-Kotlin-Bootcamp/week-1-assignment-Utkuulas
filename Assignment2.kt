/*
* In this challenge, you are required to calculate and print the sum of the elements in an array,
* keeping in mind that some of those integers may be quite large.
* Function Description Complete the aVeryBigSum function in the editor below.
* It must return the sum of all array elements.
* aVeryBigSum has the following parameter(s): int ar[n]: an array of integers.
* Return long: the sum of all array elements
* Input Format The first line of the input consists of an integer .
* The next line contains space-separated integers contained in the array.
* Output Format Return the integer sum of the elements in the array.
* */

fun main() {

    println("Please type length of the array: ")

    val arCount = readln()!!.trim().toInt()          // Removes whitespaces from the input and converts to an integer

    println("Please type numbers leaving a white space between them: ")

    val ar = readln()!!.trimEnd().split(" ").map { it.toLong() }.toTypedArray()  // Removes whitespaces from the input and converts to a long array

    val result = aVeryBigSum(ar)

    println(result)
}

fun aVeryBigSum(ar: Array<Long>): Long {
    var sumOfNumbers: Long = 0

    for (number in ar) {
        sumOfNumbers += number
    }

    return sumOfNumbers
}