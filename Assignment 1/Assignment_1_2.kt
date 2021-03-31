package com.xoxoday.compass

/**
 * Given n candies
 * To print the maximum number of prizes (k)
 * where each prize is unique
 *
 * @param n The number of candies
 *
 * @return String with max number of prizes in the first line
 *         The distribution in the second line,
 *         each separated by a space
 */
fun maxNumberOfPrices(n: Int) : String {
    var result = ""
    val distribution = ArrayList<Int>()

    var k = n
    var l = 1

    while (k > 0) {

        if (k <= 2*l) {
            distribution.add(k)
            k -= k
        } else {
            distribution.add(l)
            k -= l
        }

        l++
    }

    result = result.plus("${distribution.size}\n")
    distribution.forEach {
        result = result.plus("$it ")
    }

    return result
}