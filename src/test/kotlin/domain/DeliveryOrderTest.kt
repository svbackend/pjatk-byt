package domain

import DeliveryOrder
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DeliveryOrderTest {
    @Test
    fun `Build request`() {
        val deliveryOrderTest = DeliveryOrder(
            deliveryAddress = "all. Jerozolimska 15",
            deliveryTime = "13:00",
            number = 256,
            totalSum = 751.5
        )

        Assertions.assertEquals("all. Jerozolinska 15", deliveryOrderTest.deliveryAddress)
    }
}