package domain

import DeliveryOrder
import RestaurantAddress
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.util.*

class DeliveryOrderTest {
    @Test
    fun `Delivery Order Test`() {
        val restaurantAddress = RestaurantAddress("Test", 2, listOf("Test", "Test2", "Test3"), listOf("Test", "Test2", "Test3"))

        val deliveryOrderTest = DeliveryOrder(
            deliveryAddress = "all. Jerozolimska 15",
            deliveryTime = Date(2018, 12, 31, 13, 15, 0),
            number = 256,
            restaurantAddress=restaurantAddress
        )

        Assertions.assertEquals("all. Jerozolinska 15", deliveryOrderTest.deliveryAddress)
    }
}