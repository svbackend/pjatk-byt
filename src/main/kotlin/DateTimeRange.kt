import java.util.*

data class Time(
    val h: Int,
    val m: Int,
)

open class DateTimeRange(
    val from: Time,
    val to: Time,
    val date: Date
)