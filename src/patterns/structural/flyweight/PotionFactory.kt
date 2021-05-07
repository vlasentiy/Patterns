package patterns.structural.flyweight

import java.util.*


class PotionFactory(private var potions: EnumMap<PotionType, Potion> = EnumMap(PotionType::class.java)) {

    fun createPotion(type: PotionType): Potion {
        var potion: Potion? = potions[type]
        if (potion == null) {
            when (type) {
                PotionType.HEALING -> {
                    potion = HealingPotion()
                    potions[type] = potion
                }
                PotionType.HOLY_WATER -> {
                    potion = HolyWaterPotion()
                    potions[type] = potion
                }
                PotionType.INVISIBILITY -> {
                    potion = InvisibilityPotion()
                    potions[type] = potion
                }
                PotionType.POISON -> {
                    potion = PoisonPotion()
                    potions[type] = potion
                }
                PotionType.STRENGHT -> {
                    potion = StrengthPotion()
                    potions[type] = potion
                }
            }
        }

        return potion
    }
}