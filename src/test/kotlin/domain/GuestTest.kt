package domain

import Guest
import OrderOnPlace
import RestaurantAddress
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GuestTest {
    @Test
    fun `Guest Test`() {
        val restaurantAddress = RestaurantAddress("Test", 2, listOf("Test", "Test2", "Test3"), listOf("Test", "Test2", "Test3"))

        val orderOnPlace=OrderOnPlace(
            number = 256,restaurantAddress);
        val guest = Guest(
            orderOnPlace=orderOnPlace
        );

        Assertions.assertEquals(orderOnPlace, guest.orderOnPlace);
    }
}