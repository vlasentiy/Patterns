package patterns.creational.prototype_shape

class Circle : Shape {
    var radius = 0

    constructor()
    constructor(target: Circle?) : super(target) {
        if (target != null) {
            radius = target.radius
        }
    }

    override fun clone(): Shape? {
        return Circle(this)
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Circle || !super.equals(other)){
            return false
        }
        return other.radius == radius
    }

    override fun hashCode(): Int {
        return radius
    }
}