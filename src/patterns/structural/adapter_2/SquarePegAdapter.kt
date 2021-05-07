package patterns.structural.adapter_2

import patterns.structural.adapter_2.RoundPeg
import patterns.structural.adapter_2.SquarePeg
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * Адаптер позволяет использовать Квадратные Колышки и Круглые Отверстия вместе.
 */

class SquarePegAdapter(private val peg: SquarePeg) : RoundPeg() {
    // Рассчитываем минимальный радиус, в который пролезет этот колышек.
    override var radius: Double
        get() {
            // Рассчитываем минимальный радиус, в который пролезет этот колышек.
            return sqrt((peg.width / 2).pow(2.0) * 2)
        }
        set(radius) {
            super.radius = radius
        }
}