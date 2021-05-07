package patterns.structural.facade


class DwarvenGoldDigger : DwarvenMineWorker() {
    override fun name(): String {
        return "Dwarf gold digger"
    }

    override fun work() {
        println("${name()} digs for gold")
    }
}