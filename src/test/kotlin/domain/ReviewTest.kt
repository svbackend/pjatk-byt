package domain

import Review
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import strikt.api.*
import strikt.assertions.isEqualTo

class ReviewTest {
    @Test
    fun `ReviewTest`() {
        val review = Review(3, "Test");

        assertEquals(3, review.stars);
        assertEquals("Test", review.comment);
    }

}