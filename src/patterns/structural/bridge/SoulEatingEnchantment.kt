package patterns.structural.bridge

import patterns.structural.bridge.Enchantment


class SoulEatingEnchantment : Enchantment {
    override fun onActivate() {
        println("The item spreads bloodlust.")
    }

    override fun apply() {
        println("The item eats souls of enemies")
    }

    override fun onDeactivate() {
        println("Item's bloodlust slowly disappears")
    }
}