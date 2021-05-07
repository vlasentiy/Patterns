package patterns.structural.proxy


class IvoryTower : WizardTower {
    override fun enter(wizard: Wizard) {
        println("${wizard} enters the tower.")
    }
}