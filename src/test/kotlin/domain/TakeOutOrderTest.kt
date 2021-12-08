package domain

import DATETIME_PATTERN
import RestaurantAddress
import TakeOutOrder
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.time.LocalDateTime
import java.util.*

class TakeOutOrderTest {
    @Test
    fun `Take Out Order Test`() {
        val restaurantAddress = RestaurantAddress("Test", 2, listOf("Test", "Test2", "Test3"), listOf("Test", "Test2", "Test3"))

        val takeOutOrder = TakeOutOrder(
            time =  LocalDateTime.parse("2021-12-08T10:15:30", DATETIME_PATTERN),
            number = 256,
            restaurantAddress =restaurantAddress
        )

        Assertions.assertEquals(LocalDateTime.parse("2021-12-08T10:15:30", DATETIME_PATTERN), takeOutOrder.time)
    }
}