package patterns.structural.facade


class DwarvenCartOperator : DwarvenMineWorker() {
    override fun name(): String {
        return "Dwarf card operator"
    }

    override fun work() {
        println("${name()} moves gold chunks out of the mine.")
    }
}