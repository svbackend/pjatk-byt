import Order
import java.time.LocalDate
import java.util.*

class TakeOutOrder(
    val time: LocalDate,
    number: Int,
    totalSum: Double
) : Order(number, totalSum){

}