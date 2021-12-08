import Dish
class Guest (
    val orderOnPlace: OrderOnPlace
){
    fun makeOrder(dishes: List<Dish>) : OrderOnPlace{
        val restaurantAddress = RestaurantAddress("Test", 2, listOf("Test", "Test2", "Test3"), listOf("Test", "Test2", "Test3"))

        val order = OrderOnPlace(
            number = 256,
            restaurantAddress = restaurantAddress
        );
        return order;
    }
}