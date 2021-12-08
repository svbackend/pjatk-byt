package domain

import Dish
import RestaurantAddress
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import strikt.assertions.isEqualTo

class RestaurantAddresTest {
    @Test
    fun `Restaurant Addres Test`() {
        val emp = RestaurantAddress("Test", 2, listOf("Test", "Test2", "Test3"), listOf("Test", "Test2", "Test3"))

        assertEquals("Test", emp.address)
        assertEquals(2, emp.numberOfTables)
        assertEquals("Test, Test2, Test3", emp.workingHours.joinToString())
        assertEquals("Test, Test2, Test3", emp.workingDays.joinToString())

    }
}