package patterns.creational.prototype


class Barracks {
    init {
        var factory = HeroFactoryImpl(
            ElfMage("cooking"),
            ElfWarlord("protecting")
        )

        var mage = factory.createMage()
        //var mage2 = factory.createMage()
        var warlord = factory.createWarlord()

        //mage?.price = 10
        //mage2?.price = 20

        println(mage.toString())
        //Log.d("barracks",mage2.toString())
        println(warlord.toString())

        factory = HeroFactoryImpl(
            OrcMage("staff"),
            OrcWarlord("axe")
        )

        mage = factory.createMage()
        warlord = factory.createWarlord()

        println(mage.toString())
        println(warlord.toString())
    }
}