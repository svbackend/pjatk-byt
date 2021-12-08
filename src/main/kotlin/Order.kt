open class Order (
    val number: Int,
    val restaurantAddress: RestaurantAddress,
    val dishes : MutableList<Dish> = mutableListOf(),
) {
    fun getTotalSum(): Double{
        return dishes.sumOf { it.price }
    }
    fun addDish(dish : Dish) {
        dishes.add(dish);
    }
}
