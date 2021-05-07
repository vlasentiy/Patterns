package patterns.structural.flyweight

class HealingPotion : Potion {
    override fun drink() {
        println("You feel healed. ${System.identityHashCode(this)}")
    }
}