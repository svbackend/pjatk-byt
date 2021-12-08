class Menu(
    val title: String,
    val categories: List<Category>
) {
}

class Category(
    val name: String,
    val dishes: List<Dish>
) {
}