package patterns.structural.proxy


class WizardTowerProxy(private var tower: WizardTower) : WizardTower {
    private var numberOfWizards = 0

    companion object {
        private const val NUMBER_WIZARDS_ALLOWED = 3
    }

    override fun enter(wizard: Wizard) {
        if (numberOfWizards < NUMBER_WIZARDS_ALLOWED) {
            tower.enter(wizard)
            numberOfWizards++
        } else {
            println("${wizard} is not allowed to enter!")
        }
    }
}