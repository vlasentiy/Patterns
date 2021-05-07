package patterns.structural.adapter_2

import kotlin.math.pow

/**
 * Квадратные Колышки несовместимы с Круглыми Отверстиями (они остались в проекте
 * после попередников). Но мы должны как-то интегрировать их в нашу
 * систему.
 */
class SquarePeg(val width: Double) {
    val square: Double
        get() {
            return width.pow(2.0)
        }
}