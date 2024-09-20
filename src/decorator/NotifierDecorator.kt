package decorator

abstract class NotifierDecorator(private val wrapped: Notifier) : Notifier {
    override fun send(message: String) = wrapped.send(message)
}
