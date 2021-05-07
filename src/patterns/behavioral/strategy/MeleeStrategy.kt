package patterns.behavioral.strategy

import patterns.behavioral.strategy.DragonSlayingStrategy


class MeleeStrategy: DragonSlayingStrategy {
    override fun execute() {
        println("With your Excalibur you sever the dragon's head!")
    }
}