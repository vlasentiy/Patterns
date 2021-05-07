package patterns.creational.prototype_shape

import java.util.*

class BundledShapeCache {
    private val cache: MutableMap<String, Shape> = HashMap()

    fun put(key: String, shape: Shape): Shape {
        cache[key] = shape
        return shape
    }

   operator fun get(key: String?): Shape? {
        return cache[key]?.clone()
    }

    init {
        val circle = Circle()
        circle.x = 55
        circle.y = 77
        circle.radius = 45
        circle.color = "gray"

        val rectangle = Rectangle()
        rectangle.x = 66
        rectangle.y = 99
        rectangle.width = 80
        rectangle.height = 100
        rectangle.color = "green"

        cache["Big gray circle"] = circle
        cache["Medium green rectangle"] = rectangle
    }
}