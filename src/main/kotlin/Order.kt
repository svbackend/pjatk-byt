open class Order (
    val number: Int,
    var totalSum : Double
) {
    fun countTotalSum(): Double{
        return totalSum*number;
    }
}
