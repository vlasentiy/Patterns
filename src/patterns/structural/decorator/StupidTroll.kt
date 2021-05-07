package patterns.structural.decorator


class StupidTroll: Troll {
    override fun attack() {
        println("The troll tries to grab you!")
    }

    override fun getAttackPower(): Int {
        return 10
    }

    override fun fleeBattle() {
        println("Troll runs away!")
    }
}