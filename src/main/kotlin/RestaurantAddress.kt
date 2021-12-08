class RestaurantAddress(
    val address: String,
    val numberOfTables: Int,
    var workingHours: List<String>,
    var workingDays: List<String>,
    val workTimes: MutableList<WorkTime> = mutableListOf(),
    val orders : MutableList<Order> = mutableListOf(),
) {

}