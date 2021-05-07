package patterns.structural.facade



abstract class DwarvenMineWorker {
    fun goToSleep() {
        println("${name()} go to sleep.")
    }

    fun wakeUp() {
        println("${name()} wakes up.")
    }

    fun goHome() {
        println("${name()} goes home.")
    }

    fun goToMine() {
        println("${name()} goes to the mine.")
    }

    fun action(action: Action) {
        when (action) {
            Action.GO_TO_SLEEP -> {
                goToSleep()
            }
            Action.GO_HOME -> {
                goHome()
            }
            Action.GO_TO_MINE -> {
                goToMine()
            }
            Action.WORK -> {
                work()
            }
            Action.WAKE_UP -> {
                wakeUp()
            }
            else -> {
            }
        }
    }

    fun action(vararg action: Action) {
        action.forEach { action(it) }
    }

    abstract fun name(): String
    abstract fun work()

    enum class Action {
        GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
    }
}