package domain

import Order
import RestaurantAddress
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import strikt.api.*
import strikt.assertions.isEqualTo

class OrderTest {
    @Test
    fun `Order Test`() {
        val restaurantAddress = RestaurantAddress("Test", 2, listOf("Test", "Test2", "Test3"), listOf("Test", "Test2", "Test3"));
        val order = Order(
            number = 256,
            restaurantAddress=restaurantAddress
        )

        Assertions.assertEquals(256, order.number)
    }
}