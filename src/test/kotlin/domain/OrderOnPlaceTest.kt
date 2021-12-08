package domain

import OrderOnPlace
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class OrderOnPlaceTest {
    @Test
    fun `Order On Place Test`() {
        val orderOnPlace = OrderOnPlace(
            number = 256,
            totalSum = 751.5,
        )

        Assertions.assertEquals(256, orderOnPlace.number)
    }
}