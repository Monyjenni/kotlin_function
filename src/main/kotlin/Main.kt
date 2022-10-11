fun main (){

    add()
    substract(5,1)
    var division = divide(6,3)
    println("division is ${division}")

    println(welcome("mony"))

    println(name("Chansovanmony","Yoeun"))

    println(addition(30,20))

}

//unit is void = return nth
fun add (): Unit {
    val a: Int = 2
    val b: Int = 3
    val sum = a + b
    println("sum is ${sum}")
}


//pass the value

fun substract (c: Int , d: Int ) {
    println("substract is ${c-d} ")
}

fun divide (e:Int , f:Int): Int {

    return e / f


}

fun welcome (name:String): String {
    return name
}

fun name (firstName : String ,lastName: String ) : String {
    val fname : String = "$firstName $lastName"
    return fname
}

fun addition (lek1: Int , lek2 : Int ) : Int {
    return lek1.plus(lek2)
}