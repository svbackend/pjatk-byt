import java.time.*
import java.util.*

class BookedTime(
    from: LocalDateTime,
    to: LocalDateTime
) : DateTimeRange(from, to)