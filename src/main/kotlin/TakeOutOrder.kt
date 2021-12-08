import Order
class TakeOutOrder(
    val time: String,
    number: Int,
    totalSum: Double
) : Order(number, totalSum){

}