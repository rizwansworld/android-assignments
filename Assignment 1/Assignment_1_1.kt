package com.xoxoday.compass

import kotlin.math.max

/**
 * Function to calculate Greatest Common Divisor
 * (GCD) of two numbers a and b
 *
 * @param a first number
 * @param b second number
 *
 * @return GCD of [a] and [b]
 */
fun gcd(a: Int, b: Int) : Int {

    //Time Complexity : O(Log min(a,b))
    if (a == 0)
        return b

    return gcd(b % a, a)

    //Time Complexity : O(max(a,b))
//    var result = 0
//    val max = max(a, b)
//
//    for (i in 1..max) {
//        if (a % i == 0 && b % i == 0)
//            result = i
//    }
//
//    return result

}