package factory

fun main() {
    val carFactory = CarFactory()
    carFactory.deliverTransport()

    val bicycleFactory = BicycleFactory()
    bicycleFactory.deliverTransport()
}
