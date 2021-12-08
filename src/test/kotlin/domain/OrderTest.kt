package domain

import Order
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import strikt.api.*
import strikt.assertions.isEqualTo

class OrderTest {
    @Test
    fun `Build request`() {
        val order = Order(
            number = 256,
            totalSum = 751.5,
        )

        Assertions.assertEquals(256, order.number)
    }
}