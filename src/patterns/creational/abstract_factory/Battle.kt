package patterns.creational.abstract_factory

import patterns.creational.abstract_factory.elf.ElfKingdomFactory
import patterns.creational.abstract_factory.orc.OrcKingdomFactory


class Battle {
    private var king: King? = null
    private var castle: Castle? = null
    private var army: Army? = null

    init {
        println("ELF KINGDOM")

        createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF))
        println(army?.getDescription())
        println(castle?.description)
        println(king?.description)

        println("ORC KINGDOM")
        createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ORC))
        println(army?.getDescription())
        println(castle?.description)
        println(king?.description)
    }

    private fun createKingdom(factory: KingdomFactory) {
        king = factory.createKing()
        castle = factory.createCastle()
        army = factory.createArmy()
    }
}

object FactoryMaker {
    fun makeFactory(type: KingdomType?): KingdomFactory {
        return when (type) {
            KingdomType.ELF -> ElfKingdomFactory()
            KingdomType.ORC -> OrcKingdomFactory()
            else -> throw IllegalArgumentException("KingdomType not supported.")
        }
    }

    enum class KingdomType {
        ELF, ORC
    }
}
