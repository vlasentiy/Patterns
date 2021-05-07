package patterns.structural.decorator


class ClubbedTroll(private val decorated: Troll) : Troll {

    override fun attack() {
        decorated.attack()
        println("The troll swings at you with the club!")
    }

    override fun getAttackPower(): Int {
        return decorated.getAttackPower() + 50
    }

    override fun fleeBattle() {
        decorated.fleeBattle()
    }
}