package domain

import Employee
import Restaurant
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import strikt.api.*
import strikt.assertions.isEqualTo

class EmployeeTest {
    @Test
    fun `Employee Test`() {
        val restaurant = Restaurant(
            "Restaurant",
            "description",
            "123"
        )
        val emp = Employee("Test", "Test", "test", "test", restaurant);

        assertEquals("Test", emp.name)
    }
}