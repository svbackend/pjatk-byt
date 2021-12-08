import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RestaurantTest {
    @Test
    fun `RestaurantTest`() {
        val emp = Restaurant("Test", "Test", "88005553535")

        assertEquals("Test", emp.title)
        assertEquals("Test", emp.description)
        assertEquals("88005553535", emp.contactPhoneNumber)

    }
}