package patterns.structural.flyweight


class InvisibilityPotion: Potion {
    override fun drink() {
        println("You become invisible. ${System.identityHashCode(this)}")
    }
}