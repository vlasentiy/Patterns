package patterns.structural.adapter_2

open class RoundPeg {
    /**
     * Круглые Колышки совместимы с Круглыми Отверстиями.
     */
    open var radius = 0.0

    constructor() {}
    constructor(radius: Double) {
        this.radius = radius
    }

}