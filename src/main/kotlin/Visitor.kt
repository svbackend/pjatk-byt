open class Visitor (
    val name: String,
    val phone : String,
    val address : String,
    val email : String
) {
    fun leaveReview() : String{
        return "hello";
    }
}