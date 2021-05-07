package patterns.creational.abstract_factory.orc

import patterns.creational.abstract_factory.Army
import patterns.creational.abstract_factory.Castle
import patterns.creational.abstract_factory.King
import patterns.creational.abstract_factory.KingdomFactory


class OrcKingdomFactory: KingdomFactory {
    override fun createCastle(): Castle {
        return OrcCastle()
    }

    override fun createKing(): King {
        return OrcKing()
    }

    override fun createArmy(): Army {
        return OrcArmy()
    }
}