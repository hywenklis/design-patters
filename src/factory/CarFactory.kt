package factory

class CarFactory: TransportFactory() {
    override fun createTransport(): Transport = Car()
}