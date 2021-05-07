package patterns.structural.proxy

import patterns.structural.proxy.Wizard


interface WizardTower {
    fun enter(wizard: Wizard)
}