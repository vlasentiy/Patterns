package patterns.creational.singleton


enum class EnumIvoryTower {
    INSTANCE;

    override fun toString(): String {
        return "${declaringClass.canonicalName} @ ${hashCode()}"
    }
}