import java.util.regex.Pattern

/**
 * Have the function ABCheck(str) take the str parameter being passed
 * and return the string true if the characters a and b are separated by exactly 3 places
 * anywhere in the string at least once (i.e. "lane borrowed" would result in true
 * because there is exactly three characters between a and b). Otherwise, return the string false.
 */
fun abCheck(input: String): Boolean {
    val pattern = Pattern.compile("a..b|b..a")
    val matcher = pattern.matcher(input)
    return matcher.find()
}

/**
 * Have the function AdditivePersistence(num) take the num parameter being passed
 * which will always be a positive integer
 * and return its additive persistence which is the number of times
 * you must add the digits in num until you reach a single digit.
 * ---
 * For example: if num is 2718 then your program
 * should return 2 because 2 + 7 + 1 + 8 = 18
 * and 1 + 8 = 9, and you stop at 9.
 */
fun additivePersistence(num: Int, additive: Int = 1): Int {
    val sum = num.toString().toList().mapNotNull { it.digitToIntOrNull() }.sum()
    return if (sum < 10) {
        additive
    } else {
        additivePersistence(num = sum, additive = additive + 1)
    }
}

/**
 * Have the function AlphabetSoup(str) take the str string parameter being passed
 * and return the string with the letters in alphabetical order (i.e. hello becomes ehllo).
 * Assume numbers and punctuation symbols will not be included in the string.
 */
fun alphabetSoup(input: String) = input.toList().sorted().joinToString("")

/**
 * Have the function ArithGeo(arr) take the array of numbers stored in arr
 * and return the string "Arithmetic" if the sequence follows an arithmetic pattern
 * or return "Geometric" if it follows a geometric pattern.
 * ---
 * If the sequence doesn't follow either pattern return -1.
 * An arithmetic sequence is one where the difference between
 * each of the numbers is consistent, where in a geometric sequence,
 * each term after the first is multiplied by some constant or common ratio.
 * ---
 * Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54].
 * Negative numbers may be entered as parameters, 0 will not be entered,
 * and no array will contain all the same elements.
 */
fun arithGeo(input: List<Int>): String {
    if (input.size <= 1) return "-1"
    val isArithmetic = input.mapIndexedNotNull { index, value ->
        input.getOrNull(index - 1)?.let { value - it }
    }.toSet().size == 1
    if (isArithmetic) {
        return "Arithmetic"
    }
    val isGeometric = input.mapIndexedNotNull { index, value ->
        input.getOrNull(index - 1)?.let { value / it }
    }.let { ratios -> ratios.toSet().size == 1 }
    if (isGeometric) {
        return "Geometric"
    }
    return "-1"
}

/**
 * Have the function ArrayAdditionI(arr) take the array of numbers stored in arr
 * and return the string true if any combination of numbers in the array
 * (excluding the largest number) can be added up to equal the largest number in the array,
 * otherwise return the string false.
 * ---
 * For example: if arr contains [4, 6, 23, 10, 1, 3] the output
 * should return true because 4 + 6 + 10 + 3 = 23.
 * ---
 * The array will not be empty, will not contain all the same elements,
 * and may contain negative numbers.
 */
// Todo: Resolve this.
fun arrayAddition(input: List<Int>): Boolean {
    if (input.isEmpty()) return false

    return input.maxOrNull()?.let { max ->
        input.filter { it != max }
            .let Combo@{ combinations ->

                combinations.sum() == max ||
                        combinations.any { combo1 ->
                            combinations.any { combo2 -> combo1 + combo2 == max }
                        } || combinations.let {
                    var combinationExists = false
                    it.reduceOrNull { acc, i ->
                        val sum = acc + i
                        if (sum == max) {
                            combinationExists = true
                        }
                        sum
                    }
                    combinationExists
                }
            }
    } ?: false
}


/**
 * Have the function BasicRomanNumerals(str) read str which will be a string of Roman numerals.
 * The numerals being used are: I for 1, V for 5, X for 10, L for 50,
 * C for 100, D for 500 and M for 1000.
 * In Roman numerals, to create a number like 11 you simply add a 1 after the 10,
 * so you get XI. But to create a number like 19, you use the subtraction notation
 * which is to add I before an X or V (or add an X before an L or C).
 * So 19 in Roman numerals is XIX.
 * ---
 * The goal of your program is to return the decimal equivalent of the Roman numeral given.
 * For example: if str is "XXIV" your program should return 24
 */
fun basicRomanNumerals(input: String): Int {
    val map = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0
    var prev = 0
    for (i in input.indices) {
        val current = map[input[i]] ?: return 0
        if (current < prev) {
            result -= current
        } else {
            result += current
        }
        prev = current
    }
    return result
}

/**
 * Have the function BinaryReversal(str) take the str parameter being passed,
 * which will be a positive integer, take its binary representation
 * (padded to the nearest N * 8 bits), reverse that string of bits,
 * and then finally return the new reversed string in decimal form.
 * ---
 * For example: if str is "47" then the binary version of this integer is 101111,
 * but we pad it to be 00101111. Your program should reverse this binary string
 * which then becomes: 11110100 and then finally return
 * the decimal version of this string, which is 244.
 */
fun binaryReversal(input: Int): Int {
    val binary = Integer.toBinaryString(input).padStart(8, '0')
    val reversed = binary.reversed()
    return reversed.toInt(2)
}

// Palindrome Checker: Write a function that takes a string as input and returns true if the string is a palindrome (reads the same backward as forward), false otherwise. i.e BOB
fun palindromeChecker(input: String): Boolean {
    listOf(1, 2).binarySearch(2)
    val reversedInput = input.reversed()
    return input.lowercase() == reversedInput.lowercase();
}

fun adjacentStarCount(board: List<List<String>>): List<List<String>> =
    board.mapIndexed { lineIndex, line ->
        line.mapIndexed { index, value ->
            if (value != ".") {
                value
            } else {
                var adjacentStarCount = 0
                line.getOrNull(index - 1)?.let {
                    if (it=="*") {
                        adjacentStarCount += 1
                    }
                }
                line.getOrNull(index + 1)?.let {
                    if (it=="*") {
                        adjacentStarCount += 1
                    }
                }
                board.getOrNull(lineIndex - 1)?.let { previousLine ->
                    previousLine.getOrNull(index - 1)?.let {
                        if (it == "*") {
                            adjacentStarCount += 1
                        }
                    }
                    previousLine.getOrNull(index)?.let {
                        if (it == "*") {
                            adjacentStarCount += 1
                        }
                    }
                    previousLine.getOrNull(index + 1)?.let {
                        if (it == "*") {
                            adjacentStarCount += 1
                        }
                    }
                }
                board.getOrNull(lineIndex + 1)?.let { nextLine ->
                    nextLine.getOrNull(index - 1)?.let {
                        if (it == "*") {
                            adjacentStarCount += 1
                        }
                    }
                    nextLine.getOrNull(index)?.let {
                        if (it == "*") {
                            adjacentStarCount += 1
                        }
                    }
                    nextLine.getOrNull(index + 1)?.let {
                        if (it == "*") {
                            adjacentStarCount += 1
                        }
                    }
                }
                adjacentStarCount.toString()
            }
        }
    }







