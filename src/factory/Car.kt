package factory

class Car: Transport {
    override fun deliver() {
        println("Entrega feita por Carro.")
    }
}