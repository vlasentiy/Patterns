package patterns.structural.bridge


class Hammer(private val enchantment: Enchantment) : Weapon {

    override fun wield() {
        println("The hammer is wielded")
        enchantment.onActivate()
    }

    override fun swing() {
        println("The hummer is swinged")
        enchantment.apply()
    }

    override fun unwield() {
        println("The hummer is unwielded")
        enchantment.onDeactivate()
    }

    override fun getEnchantment(): Enchantment {
        return enchantment
    }
}