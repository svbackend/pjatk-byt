package domain

import Guest
import OrderOnPlace
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class GuestTest {
    @Test
    fun `Guest Test`() {
        val orderOnPlace=OrderOnPlace(
            number = 256,
            totalSum = 751.5,);
        val guest = Guest(
            orderOnPlace=orderOnPlace
        );

        Assertions.assertEquals(orderOnPlace, guest.orderOnPlace);
    }
}