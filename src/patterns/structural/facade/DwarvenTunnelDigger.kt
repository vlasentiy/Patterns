package patterns.structural.facade

import patterns.structural.facade.DwarvenMineWorker


class DwarvenTunnelDigger : DwarvenMineWorker() {
    override fun name(): String {
        return "Dwarf tunnel digger"
    }

    override fun work() {
        println("${name()} creates another promising tunnel")
    }
}