package ch06.TheLetFunction

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main() {
    var email: String? = "yole@example.com"
    email?.let { sendEmailTo(it) }
    email = null
    email?.let { sendEmailTo(it) }
}