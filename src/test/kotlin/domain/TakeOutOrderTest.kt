package domain

import TakeOutOrder
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

class TakeOutOrderTest {
    @Test
    fun `Build request`() {
        val takeOutOrder = TakeOutOrder(
            time =  Date(2018, 12, 31, 13, 15, 0),
            number = 256,
            totalSum = 751.5
        )

        Assertions.assertEquals(Date(2018, 12, 31, 13, 15, 0), takeOutOrder.time)
    }
}