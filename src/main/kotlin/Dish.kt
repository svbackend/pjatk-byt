class Dish(
    val name: String,
    val ingredients: List<String>,
    var price: Double,
    val weight: Int,
) {
    fun changePrice(newPrice: Double) {
        price = newPrice
    }
}