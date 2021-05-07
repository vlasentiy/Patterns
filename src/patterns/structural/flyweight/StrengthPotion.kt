package patterns.structural.flyweight

import patterns.structural.flyweight.Potion


class StrengthPotion : Potion {
    override fun drink() {
        println("You feel strong. ${System.identityHashCode(this)}")
    }
}