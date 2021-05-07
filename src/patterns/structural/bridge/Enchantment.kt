package patterns.structural.bridge


interface Enchantment {
    fun onActivate()
    fun apply()
    fun onDeactivate()
}