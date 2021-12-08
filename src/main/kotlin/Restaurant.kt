class Restaurant(
    val title: String,
    val description: String,
    val contactPhoneNumber: String,
    val employees: MutableList<Employee> = mutableListOf()
) {
    fun addEmployee(employee: Employee) {
        employees.add(employee)
    }
}