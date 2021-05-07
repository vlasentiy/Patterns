package patterns.creational.prototype


interface HeroFactory {
    fun createWarlord(): Warlord?
    fun createMage(): Mage?
}