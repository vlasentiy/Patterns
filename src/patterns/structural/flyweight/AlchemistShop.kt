package patterns.structural.flyweight

import java.util.*
import java.util.Collections.unmodifiableList
import kotlin.collections.ArrayList


class AlchemistShop {
    private var topShelf: List<Potion> = ArrayList()
    private var bottomShelf: List<Potion> = ArrayList()

    init {
        val factory = PotionFactory()
        topShelf = listOf(
            factory.createPotion(PotionType.INVISIBILITY),
            factory.createPotion(PotionType.INVISIBILITY),
            factory.createPotion(PotionType.STRENGHT),
            factory.createPotion(PotionType.HOLY_WATER),
            factory.createPotion(PotionType.HEALING),
            factory.createPotion(PotionType.INVISIBILITY),
            factory.createPotion(PotionType.STRENGHT),
            factory.createPotion(PotionType.HOLY_WATER)
        )
        bottomShelf = listOf(
            factory.createPotion(PotionType.POISON),
            factory.createPotion(PotionType.POISON),
            factory.createPotion(PotionType.POISON),
            factory.createPotion(PotionType.HOLY_WATER),
            factory.createPotion(PotionType.HOLY_WATER)
        )
    }

    /**
     * Get a read-only list of all the items on the top shelf.
     */
    fun getTopShelf(): List<Potion> {
        return Collections.unmodifiableList(topShelf)
    }

    fun getBottomShelf(): List<Potion> {
        return unmodifiableList(bottomShelf)
    }

    fun enumerate() {
        println("Enumerating top shelf potions\n")
        for (p in topShelf) {
            p.drink()
        }
        println("Enumerating bottom shelf potions\n")
        for (p in bottomShelf) {
            p.drink()
        }
    }
}