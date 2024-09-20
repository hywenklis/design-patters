package decorator

class FacebookNotifierDecorator(notifier: Notifier) : NotifierDecorator(notifier) {
    override fun send(message: String) {
        super.send(message)
        sendFacebookMessage(message)
    }

    private fun sendFacebookMessage(message: String) {
        println("Enviando mensagem por FaceBook: $message")
    }
}