package patterns.structural.adapter_2

class RoundHole(val radius: Double) {

    /**
     * Круглое Отверстие совместимо с Круглыми Колышками.
     */

    fun fits(peg: RoundPeg): Boolean {
        return peg.radius <= radius
    }

}