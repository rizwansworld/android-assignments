package com.xoxoday.compass

import kotlinx.io.ByteArrayOutputStream
import org.junit.Test

import org.junit.Assert.*

class Assignment_1_2Test {

    @Test
    fun `n = 6, returns number of ranks (k) = 3, distribution = 1 2 3`() {
        assertEquals(
            maxNumberOfPrices(6), "3\n1 2 3 "
        )
    }

    @Test
    fun `n = 8, returns number of ranks (k) = 3, distribution = 1 2 5`() {
        assertEquals(
            maxNumberOfPrices(8), "3\n1 2 5 "
        )
    }

    @Test
    fun `n = 2, returns number of ranks (k) = 1, distribution = 2`() {
        assertEquals(
            maxNumberOfPrices(2), "1\n2 "
        )
    }
}