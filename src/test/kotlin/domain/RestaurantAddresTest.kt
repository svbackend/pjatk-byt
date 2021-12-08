package domain

import Dish
import RestaurantAddress
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import strikt.assertions.isEqualTo

class RestaurantAddresTest {
    @Test
    fun `Restaurant Addres Test`() {
        val restaurantAddress = RestaurantAddress("Test", 2, listOf("Test", "Test2", "Test3"), listOf("Test", "Test2", "Test3"))

        assertEquals("Test", restaurantAddress.address)
        assertEquals(2, restaurantAddress.numberOfTables)
        assertEquals("Test, Test2, Test3", restaurantAddress.workingHours.joinToString())
        assertEquals("Test, Test2, Test3", restaurantAddress.workingDays.joinToString())

    }
}