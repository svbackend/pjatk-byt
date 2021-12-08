import java.util.*

class DeliveryOrder(
    val deliveryAddress: String,
    deliveryTime: Date,
    number: Int,
    totalSum: Double
) : Order(number, totalSum){

}