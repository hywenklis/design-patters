package strategy

class SeasonalDiscount : DiscountStrategy {
    override fun applyDiscount(amount: Double): Double = amount * 0.8
}