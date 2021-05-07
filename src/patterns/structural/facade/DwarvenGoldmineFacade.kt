package patterns.structural.facade


class DwarvenGoldmineFacade {
    var workers: List<DwarvenMineWorker> = ArrayList()

    companion object {
        fun makeActions(
            workers: Collection<DwarvenMineWorker>,
            vararg actions: DwarvenMineWorker.Action
        ) {
            workers.forEach { it.action(*actions) }
        }
    }

    init {
        workers = arrayListOf(
            DwarvenGoldDigger(),
            DwarvenCartOperator(),
            DwarvenTunnelDigger()
        )
    }

    fun startNewDay() {
        makeActions(workers, DwarvenMineWorker.Action.WAKE_UP, DwarvenMineWorker.Action.GO_TO_MINE)
    }

    fun digOutGold() {
        makeActions(workers, DwarvenMineWorker.Action.WORK)
    }

    fun endDay() {
        makeActions(workers, DwarvenMineWorker.Action.GO_HOME)
    }
}