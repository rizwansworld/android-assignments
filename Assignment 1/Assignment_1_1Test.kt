package com.xoxoday.compass

import org.junit.Assert.assertEquals
import org.junit.Test

class Assignment_1_1Test {

    @Test
    fun `gcd of 10 and 15, returns 5`() {
        assertEquals(gcd(10, 15), 5)
    }

    @Test
    fun `gcd of 15 and 10, returns 5`() {
        assertEquals(gcd(15, 10), 5)
    }

    @Test
    fun `gcd of 18 and 35, returns 1`() {
        assertEquals(gcd(18, 35), 1)
    }

    @Test
    fun `gcd of 1344 and 217, returns 7`() {
        assertEquals(gcd(1344, 217), 7)
    }

    @Test
    fun `gcd of 28851538 and 1183019, returns 17657`() {
        assertEquals(gcd(28851538, 1183019), 17657)
    }

    @Test
    fun `gcd of 1183019 and 28851538, returns 17657`() {
        assertEquals(gcd(1183019, 28851538), 17657)
    }

}