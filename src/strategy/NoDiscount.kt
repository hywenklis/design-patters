package strategy

class NoDiscount : DiscountStrategy {
    override fun applyDiscount(amount: Double): Double = amount
}