package domain

import Visitor
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class VisitorTest {
    @Test
    fun `Build request`() {
        val visitor = Visitor(
             name="John",
             phone ="+485269871",
             address ="al. Jerozolimska  12",
             email = "john1987@gmail.com"
        )

        Assertions.assertEquals("john1987@gmail.com", visitor.email)
    }
}