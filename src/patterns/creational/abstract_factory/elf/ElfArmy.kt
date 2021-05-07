package patterns.creational.abstract_factory.elf

import patterns.creational.abstract_factory.Army


class ElfArmy : Army {
    override fun getDescription(): String? {
        return "This is the Elven Army!"
    }
}