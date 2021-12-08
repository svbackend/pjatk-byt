class DeliveryOrder(
    val deliveryAddress: String,
    deliveryTime: String,
    number: Int,
    totalSum: Double
) : Order(number, totalSum){

}