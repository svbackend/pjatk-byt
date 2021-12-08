class RegularVisitor(
    val numberOfVisits: Int,
    discount: Int,
    name: String,
    phone: String,
    address: String,
    email: String,
    takeOutOrder: TakeOutOrder?,
    deliveryOrder: DeliveryOrder?
) : Visitor(
    name,
    phone,
    address,
    email,
    takeOutOrder=null,
    deliveryOrder=null
){

    }