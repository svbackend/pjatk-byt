package domain

import Employee
import Restaurant
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RestaurantTest {
    @Test
    fun `Restaurant AddEmployee Test`() {
        val restaurant = Restaurant(
            "Restaurant",
            "description",
            "123"
        )

        val emp = Employee(
            "Test",
            "Test",
            "test",
            "test",
            restaurant,
        )

        restaurant.addEmployee(emp)

        assertEquals(1, restaurant.employees.size)
        val actualEmployee = restaurant.employees.first()

        assertEquals(emp.name, actualEmployee.name)
    }
}