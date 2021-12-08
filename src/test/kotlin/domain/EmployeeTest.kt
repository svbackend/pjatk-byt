package domain

import Employee
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import strikt.api.*
import strikt.assertions.isEqualTo

class EmployeeTest {
    @Test
    fun `Employee Test`() {
        val emp = Employee("Test", "Test", "test", "test")

        assertEquals("Test", emp.name)
    }
}