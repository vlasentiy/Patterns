package patterns.creational.prototype


abstract class Mage : Prototype {

    public var price = 0

    constructor() {}
    constructor(source: Mage?) {}

    abstract override fun copy(): Mage

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