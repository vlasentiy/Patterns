package patterns.creational.prototype_shape

abstract class Shape {
    var x = 0
    var y = 0
    var color: String? = null

    constructor()
    constructor(target: Shape?) {
        if (target != null) {
            x = target.x
            y = target.y
            color = target.color
        }
    }

    abstract fun clone(): Shape?

    override fun equals(other: Any?): Boolean {
        if (other !is Shape) {
            return false
        }
        return other.x == x && other.y == y && other.color == color
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        result = 31 * result + (color?.hashCode() ?: 0)
        return result
    }
}