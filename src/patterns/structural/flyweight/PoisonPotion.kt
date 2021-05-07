package patterns.structural.flyweight


class PoisonPotion : Potion {
    override fun drink() {
        println("This is poisonous. ${System.identityHashCode(this)}")
    }
}