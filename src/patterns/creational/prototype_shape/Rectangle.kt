package patterns.creational.prototype_shape

class Rectangle : Shape {
    var width = 0
    var height = 0

    constructor()
    constructor(target: Rectangle?) : super(target) {
        if (target != null) {
            width = target.width
            height = target.height
        }
    }

    override fun clone(): Shape? {
        return Rectangle(this)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Rectangle || !super.equals(other)){
            return false
        }
        return other.width == width && other.height == height
    }

    override fun hashCode(): Int {
        var result = width
        result = 31 * result + height
        return result
    }
}