package factory

class BicycleFactory: TransportFactory() {
    override fun createTransport(): Transport = Bicycle()
}