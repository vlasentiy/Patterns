package patterns.creational.prototype

abstract class Warlord : Prototype {
    constructor() {}
    constructor(source: Warlord?) {}

    abstract override fun copy(): Warlord

    override fun equals(obj: Any?): Boolean {
        if (this === obj) {
            return true
        }
        return if (obj == null) {
            false
        } else javaClass == obj.javaClass
    }

    override fun hashCode(): Int {
        return javaClass.hashCode()
    }
}