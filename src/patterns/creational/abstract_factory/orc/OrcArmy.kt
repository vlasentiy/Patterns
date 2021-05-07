package patterns.creational.abstract_factory.orc

import patterns.creational.abstract_factory.Army


class OrcArmy: Army {
    override fun getDescription(): String? {
        return "This is the Orc Army!"
    }
}