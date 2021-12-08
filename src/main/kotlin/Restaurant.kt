class Restaurant(
    val title: String,
    val description: String,
    val contactPhoneNumber: String,
    val employees: MutableList<Employee> = mutableListOf(),
    val addresses: MutableList<RestaurantAddress> = mutableListOf(),
) {
    fun addEmployee(employee: Employee) {
        employees.add(employee)
    }

    fun addAddress(addr: RestaurantAddress) {
        addresses.add(addr)
    }
}