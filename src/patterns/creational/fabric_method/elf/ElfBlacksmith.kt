package patterns.creational.fabric_method.elf

import patterns.creational.fabric_method.Blacksmith
import patterns.creational.fabric_method.Weapon
import patterns.creational.fabric_method.WeaponType
import java.util.*

class ElfBlacksmith : Blacksmith {
    companion object {
        private var ELF_ARSENAL: MutableMap<WeaponType, ElfWeapon>? = null

        init {
            ELF_ARSENAL = HashMap(WeaponType.values().size)

            for (type in WeaponType.values()) {
                (ELF_ARSENAL as HashMap<WeaponType, ElfWeapon>)[type] = ElfWeapon(type)
            }
        }
    }

    override fun manufactureWeapon(weaponType: WeaponType?): Weapon? {
        return ELF_ARSENAL?.get(weaponType)
    }
}