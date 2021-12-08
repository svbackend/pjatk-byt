class RestaurantOwner(
    name: String,
    surname: String,
    address: String,
    phone: String,
    restaurant: Restaurant,
) : Employee(name, surname, address, phone, restaurant) {

}