package ch04

class Client(val name: String, val postalCode: Int) {
    override fun toString(): String = "Client(name=$name, postalCode:$postalCode)"
}

fun main() {
    val client = Client("Ryeojin", 1234)
    println(client)
}