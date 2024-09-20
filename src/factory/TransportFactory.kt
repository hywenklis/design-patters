package factory

abstract class TransportFactory {
    abstract fun createTransport(): Transport

    fun deliverTransport() {
        val transport = createTransport()
        transport.deliver()
    }
}