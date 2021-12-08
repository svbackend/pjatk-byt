package domain

import OrderOnPlace
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class OrderOnPlaceTest {
    @Test
    fun `Build request`() {
        val orderOnPlace = OrderOnPlace(
            number = 256,
            totalSum = 751.5,
        )

        Assertions.assertEquals(256, orderOnPlace.number)
    }
}