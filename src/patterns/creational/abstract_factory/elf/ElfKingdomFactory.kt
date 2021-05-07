package patterns.creational.abstract_factory.elf

import patterns.creational.abstract_factory.Army
import patterns.creational.abstract_factory.Castle
import patterns.creational.abstract_factory.King
import patterns.creational.abstract_factory.KingdomFactory


class ElfKingdomFactory : KingdomFactory {
    override fun createCastle(): Castle {
        return ElfCastle()
    }

    override fun createKing(): King {
        return ElfKing()
    }

    override fun createArmy(): Army {
        return ElfArmy()
    }
}