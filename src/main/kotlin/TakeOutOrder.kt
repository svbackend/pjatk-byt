import Order
import java.util.*

class TakeOutOrder(
    val time: Date,
    number: Int,
    totalSum: Double
) : Order(number, totalSum){

}