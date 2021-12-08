import Dish
class Guest {
    fun makeOrder(dishes: List<Dish>) : Order{
        val order = Order(
            number = 256,
            totalSum = 751.5,
        );
        return order;
    }
}