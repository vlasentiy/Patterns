package patterns.structural.flyweight


class HolyWaterPotion : Potion {
    override fun drink() {
        println("You feel blessed. ${System.identityHashCode(this)}")
    }
}