package strategy

class LoyaltyDiscount : DiscountStrategy {
    override fun applyDiscount(amount: Double): Double = amount * 0.9
}