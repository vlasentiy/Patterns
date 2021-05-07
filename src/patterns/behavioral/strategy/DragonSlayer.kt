package patterns.behavioral.strategy


class DragonSlayer(private var strategy: DragonSlayingStrategy) {
    fun changeStrategy(strategy: DragonSlayingStrategy){
        this.strategy=strategy
    }

    fun goToBattle(){
        strategy.execute()
    }
}