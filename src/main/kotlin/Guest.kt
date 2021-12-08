import Dish
class Guest (
    val orderOnPlace: OrderOnPlace
){
    fun makeOrder(dishes: List<Dish>) : OrderOnPlace{
        val order = OrderOnPlace(
            number = 256,
            totalSum = 751.5,
        );
        return order;
    }
}