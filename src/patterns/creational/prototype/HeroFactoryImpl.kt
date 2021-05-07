package patterns.creational.prototype


class HeroFactoryImpl: HeroFactory {
    private var mage: Mage? = null
    private var warlord: Warlord? = null

    constructor(mage: Mage, warlord: Warlord){
        this.mage = mage
        this.warlord = warlord
    }

    override fun createWarlord(): Warlord? {
        return warlord?.copy()
    }

    override fun createMage(): Mage? {
        return mage?.copy()
    }
}