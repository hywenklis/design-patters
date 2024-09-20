package decorator

fun main() {
    val basicNotifier = BasicNotifier()

    val emailNotifier = EmailNotifierDecorator(basicNotifier)
    emailNotifier.send("Olá, Herbert!")

    val facebookNotifier = FacebookNotifierDecorator(emailNotifier)
    facebookNotifier.send("Oi novamente!")
}
