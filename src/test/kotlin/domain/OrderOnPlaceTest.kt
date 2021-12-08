package domain

import OrderOnPlace
import RestaurantAddress
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class OrderOnPlaceTest {
    @Test
    fun `Order On Place Test`() {
        val restaurantAddress = RestaurantAddress("Test", 2, listOf("Test", "Test2", "Test3"), listOf("Test", "Test2", "Test3"))

        val orderOnPlace = OrderOnPlace(
            number = 256,
            restaurantAddress=restaurantAddress
        )

        Assertions.assertEquals(256, orderOnPlace.number)
    }
}