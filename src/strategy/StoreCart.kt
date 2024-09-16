package strategy

class StoreCart(private var discountStrategy: DiscountStrategy) {

    fun calculateFinalAmount(amount: Double): Double = discountStrategy.applyDiscount(amount)

    fun setDiscountStrategy(strategy: DiscountStrategy) {
        this.discountStrategy = strategy
    }
}
