package strategy

fun main() {
    val noDiscountStrategy = NoDiscount()
    val loyaltyDiscountStrategy = LoyaltyDiscount()
    val seasonalDiscountStrategy = SeasonalDiscount()
    val cart = StoreCart(noDiscountStrategy)
    val totalAmount = 100.0

    println("Total sem desconto: ${cart.calculateFinalAmount(totalAmount)}")

    // Aplicando desconto de fidelidade (10%)
    cart.setDiscountStrategy(loyaltyDiscountStrategy)
    println("Total com desconto de fidelidade: ${cart.calculateFinalAmount(totalAmount)}")

    // Aplicando desconto sazonal (20%)
    cart.setDiscountStrategy(seasonalDiscountStrategy)
    println("Total com desconto sazonal: ${cart.calculateFinalAmount(totalAmount)}")
}