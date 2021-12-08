import java.time.*

class WorkTime(
    from: LocalDateTime,
    to: LocalDateTime,
) : DateTimeRange(from, to)