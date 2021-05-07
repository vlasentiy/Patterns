package patterns.behavioral.strategy

import patterns.behavioral.strategy.DragonSlayer
import patterns.behavioral.strategy.MeleeStrategy
import patterns.behavioral.strategy.SpellStrategy


class Strategy {
    init {
        val dragonSlayer = DragonSlayer(MeleeStrategy())
        dragonSlayer.goToBattle()
        dragonSlayer.changeStrategy(SpellStrategy())
        dragonSlayer.goToBattle()
    }
}