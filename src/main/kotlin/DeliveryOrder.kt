import java.util.*

class DeliveryOrder(
    val deliveryAddress: String,
    deliveryTime: Date,
    number: Int,
    restaurantAddress : RestaurantAddress
) : Order(number, restaurantAddress){

}