package patterns.creational.prototype_shape


class Geometry {
    init {
        val shapes: MutableList<Shape> = ArrayList()
        val shapesCopy: MutableList<Shape?> = ArrayList()

        val circle = Circle()
        circle.x = 11
        circle.y = 22
        circle.radius = 17
        circle.color = "green"
        shapes.add(circle)

        val anotherCircle = circle.clone() as Circle
        shapes.add(anotherCircle)

        val rectangle = Rectangle()
        rectangle.width = 11
        rectangle.height = 22
        circle.color = "gray"
        shapes.add(rectangle)

        cloneAndCompare(shapes, shapesCopy)

        getCashedShapes()
    }

    private fun cloneAndCompare(shapes: MutableList<Shape>, shapesCopy: MutableList<Shape?>) {
        shapes.forEach { shapesCopy.add(it.clone()) }

        for (i in shapes.indices) {
            if (shapes[i] !== shapesCopy[i]) {
                println("$i: Shapes are different objects!")
                if (shapes[i].equals(shapesCopy[i])) { // '==' and equals()
                    println("$i: And they are identical")
                } else {
                    println("$i: But they are not identical")
                }
            } else {
                println("$i: Shape objects are the same")
            }
        }
    }

    private fun getCashedShapes(){
        val cache = BundledShapeCache()

        val shape1 = cache.get("Big gray circle")
        val shape2 = cache.get("Medium green rectangle")
        val shape3 = cache.get("Medium green rectangle")

        if (shape1 !== shape2 && !shape1!!.equals(shape2)) {
            println("Big gray circle != Medium green rectangle")
        } else {
            println("Big gray circle == Medium green rectangle")
        }

        if (shape2 !== shape3) {
            println("Medium green rectangles are two different objects")
            if (shape2!!.equals(shape3)) {
                println("And they are identical")
            } else {
                println("But they are not identical")
            }
        } else {
            println("Rectangle objects are the same")
        }
    }
}