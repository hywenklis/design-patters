package decorator

class EmailNotifierDecorator(notifier: Notifier) : NotifierDecorator(notifier) {
    override fun send(message: String) {
        super.send(message)
        sendEmail(message)
    }

    private fun sendEmail(message: String) {
        println("Enviando notificação por e-mail: $message")
    }
}