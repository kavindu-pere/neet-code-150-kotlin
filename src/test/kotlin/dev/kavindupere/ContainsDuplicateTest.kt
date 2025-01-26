package dev.kavindupere

import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.test.Test
import kotlin.test.assertFalse


class ContainsDuplicateTest {

    private val testContainsDuplicate = ContainsDuplicate()

    @Test
    fun testContainsDuplicate_shouldReturnTrue() {
        val nums = arrayOf(1, 2, 3, 3, 4, 5)
        val hasDuplicate = testContainsDuplicate.hasDuplicate(nums)
        assertTrue(hasDuplicate)
    }

    @Test
    fun testContainsDuplicate_shouldReturnFalse() {
        val nums = arrayOf(1, 2, 3, 4, 5)
        val hasDuplicate = testContainsDuplicate.hasDuplicate(nums)
        assertFalse(hasDuplicate)
    }

}