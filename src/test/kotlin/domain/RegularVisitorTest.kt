package domain

import RegularVisitor
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RegularVisitorTest {
    @Test
    fun `Regular Visitor Test`() {
        val regularVisitor = RegularVisitor(
            numberOfVisits = 17,
            discount = 15,
            name = "Ben",
            phone = "+481523698",
            address = "all. Jerozolimska  12",
            email = "ben12566344@gmail.com"
        )

        Assertions.assertEquals("+481523698", regularVisitor.phone)
    }
}