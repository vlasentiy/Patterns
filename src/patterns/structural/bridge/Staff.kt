package patterns.structural.bridge


class Staff(private val enchantment: Enchantment) : Weapon {
    override fun wield() {
        println("The mystic staff is wielded")
        enchantment.onActivate()
    }

    override fun swing() {
        println("The mystic staff is swinged")
        enchantment.apply()
    }

    override fun unwield() {
        println("The mystic staff is unwielded")
    }

    override fun getEnchantment(): Enchantment {
        return enchantment
    }
}