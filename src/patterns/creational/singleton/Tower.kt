package patterns.creational.singleton

import patterns.creational.singleton.EnumIvoryTower

class Tower {
    init {
        // eagerly initialized singleton
        val ivoryTower1 = IvoryTower.getInstance()
        val ivoryTower2 = IvoryTower.getInstance()
        println(ivoryTower1.toString())
        println(ivoryTower2.toString())

        // lazily initialized singleton
        val threadSafeIvoryTower1 =
            ThreadSafeLazyLoadedIvoryTower.getInstance()
        val threadSafeIvoryTower2 =
            ThreadSafeLazyLoadedIvoryTower.getInstance()
        println(threadSafeIvoryTower1.toString())
        println(threadSafeIvoryTower2.toString())

        // enum singleton
        val enumIvoryTower1 = EnumIvoryTower.INSTANCE
        val enumIvoryTower2 = EnumIvoryTower.INSTANCE
        println(enumIvoryTower1.toString())
        println(enumIvoryTower2.toString())

        // double checked locking
        val dcl1 = ThreadSafeDoubleCheckLocking.getInstance()
        println(dcl1.toString())
        val dcl2 = ThreadSafeDoubleCheckLocking.getInstance()
        println(dcl2.toString())

        // initialize on demand holder idiom
//        val demandHolderIdiom =
//            InitializingOnDemandHolderIdiom.getInstance()
//        Log.d("demandHolderTower",demandHolderIdiom.toString())
//        val demandHolderIdiom2 =
//            InitializingOnDemandHolderIdiom.getInstance()
//        Log.d("demandHolderTower",demandHolderIdiom2.toString())
    }
}