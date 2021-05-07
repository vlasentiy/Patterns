package patterns.structural.bridge

import patterns.structural.bridge.Enchantment


class FlyingEnchantment : Enchantment {

    override fun onActivate() {
        println("The item begins to glow faintly.")
    }

    override fun apply() {
        println("The item flies and strikes enemies, finally returning to owner's hand")
    }

    override fun onDeactivate() {
        println("The item's glow fades")
    }
}