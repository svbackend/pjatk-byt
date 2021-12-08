class Table(
    val tableNumber: Int,
    val takenAt: MutableList<BookedTime> = mutableListOf()
) {
    fun book(time: BookedTime) {}
    fun isAvailable(time: BookedTime): Boolean = true
}