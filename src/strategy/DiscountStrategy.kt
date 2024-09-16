package strategy

interface DiscountStrategy {
    fun applyDiscount(amount: Double): Double
}