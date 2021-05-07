package patterns.creational.abstract_factory


interface Army {
    fun getDescription(): String?
}

interface Castle {
    val description: String?
}

interface King {
    val description: String?
}