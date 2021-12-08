import Order
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

class TakeOutOrder(
    val time: LocalDateTime,
    number: Int,
    restaurantAddress: RestaurantAddress
) : Order(number, restaurantAddress){

}