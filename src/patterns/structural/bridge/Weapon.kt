package patterns.structural.bridge

import patterns.structural.bridge.Enchantment


interface Weapon {
    fun wield()
    fun swing()
    fun unwield()

    fun getEnchantment(): Enchantment
}