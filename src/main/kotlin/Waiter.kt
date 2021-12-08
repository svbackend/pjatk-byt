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
    val worksDuring: List<WorkTime>
) : Employee(name, surname, address, phone, restaurant) {

}