package decorator

class BasicNotifier : Notifier {
    override fun send(message: String) = println("Enviando notificação básica: $message")
}
