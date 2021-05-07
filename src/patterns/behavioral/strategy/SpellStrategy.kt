package patterns.behavioral.strategy

import patterns.behavioral.strategy.DragonSlayingStrategy


class SpellStrategy: DragonSlayingStrategy {
    override fun execute() {
        println("You cast the spell of disintegration and the dragon vaporizes in a pile of dust!")
    }
}