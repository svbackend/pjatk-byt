package domain

import DATETIME_PATTERN
import Dish
import RestaurantAddress
import WorkTime
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import strikt.assertions.isEqualTo
import java.time.*
import java.util.*

class RestaurantAddresTest {
    @Test
    fun `RestaurantAddressTest`() {
        val from = LocalDateTime.parse("2021-12-08T10:15:00", DATETIME_PATTERN)
        val to = LocalDateTime.parse("2021-12-08T21:30:00", DATETIME_PATTERN)

        val emp = RestaurantAddress(
            "Test",
            2,
            listOf("Test", "Test2", "Test3"),
            listOf("Test", "Test2", "Test3"),
            openDuring = listOf(WorkTime(from, to))
        )

        assertEquals("Test", emp.address)
        assertEquals(2, emp.numberOfTables)
        assertEquals("Test, Test2, Test3", emp.workingHours.joinToString())
        assertEquals("Test, Test2, Test3", emp.workingDays.joinToString())

    }
}