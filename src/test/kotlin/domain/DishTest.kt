package domain

import Dish
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import strikt.assertions.isEqualTo

class DishTest {
    @Test
    fun `DishTest`() {
        val emp = Dish("Test", listOf("Test", "Test2", "Test3"), 40.50, 255)

        assertEquals("Test", emp.name)
        assertEquals("Test, Test2, Test3", emp.ingredients.joinToString())
        assertEquals(40.50, emp.price)
        assertEquals(255, emp.weight)

    }
}