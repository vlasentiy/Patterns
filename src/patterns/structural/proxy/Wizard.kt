package patterns.structural.proxy


class Wizard(private val name: String) {
    override fun toString(): String {
        return name
    }
}