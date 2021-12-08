package domain

import TakeOutOrder
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TakeOutOrderTest {
    @Test
    fun `Build request`() {
        val takeOutOrder = TakeOutOrder(
            time = "15:00",
            number = 256,
            totalSum = 751.5
        )

        Assertions.assertEquals("15:00", takeOutOrder.time)
    }
}