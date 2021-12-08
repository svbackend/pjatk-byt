class Table(
    val tableNumber: Int,
    val takenAt: MutableList<BookedTime> = mutableListOf(),
    val visitors: MutableList<Visitor> = mutableListOf(),
) {
    fun book(visitor : Visitor, time: BookedTime) {
        visitors.add(visitor)
        takenAt.add(time)
    }
    fun isAvailable(time: BookedTime): Boolean = true
}