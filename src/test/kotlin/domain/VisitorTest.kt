package domain

import Review
import Visitor
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class VisitorTest {
    @Test
    fun `Visitor Test`() {
        val review = Review(3, "Test");
        val visitor = Visitor(
             name="John",
             phone ="+485269871",
             address ="al. Jerozolimska  12",
             email = "john1987@gmail.com"
        )

        Assertions.assertEquals("john1987@gmail.com", visitor.email)

        visitor.addReview(review);

        Assertions.assertEquals(1, visitor.reviews.size);
    }
}