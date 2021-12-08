open class Visitor (
    val name: String,
    val phone : String,
    val address : String,
    val email : String,
    val reviews : MutableList<Review> = mutableListOf(),
    val takeOutOrder : TakeOutOrder? = null,
    val deliveryOrder : DeliveryOrder? = null
) {
    fun addReview(review: Review) {
        reviews.add(review);
    }

}