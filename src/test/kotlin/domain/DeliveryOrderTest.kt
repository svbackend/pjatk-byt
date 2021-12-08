package domain

import DeliveryOrder
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.util.*

class DeliveryOrderTest {
    @Test
    fun `Delivery Order Test`() {
        val deliveryOrderTest = DeliveryOrder(
            deliveryAddress = "all. Jerozolimska 15",
            deliveryTime = Date(2018, 12, 31, 13, 15, 0),
            number = 256,
            totalSum = 751.5
        )

        Assertions.assertEquals("all. Jerozolinska 15", deliveryOrderTest.deliveryAddress)
    }
}