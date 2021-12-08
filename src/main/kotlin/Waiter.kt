enum class WorkingDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

class Waiter(
    name: String,
    surname: String,
    address: String,
    phone: String,
    val workingDays: List<WorkingDay>,
    restaurant: Restaurant,
) : Employee(name, surname, address, phone, restaurant) {

}