package patterns.creational.fabric_method.orc

import patterns.creational.fabric_method.Blacksmith
import patterns.creational.fabric_method.Weapon
import patterns.creational.fabric_method.WeaponType


class OrcBlacksmith : Blacksmith {
    companion object {
        private var ORC_ARSENAL: MutableMap<WeaponType, OrcWeapon>? = null

        init {
            ORC_ARSENAL = HashMap(WeaponType.values().size)

            for (type in WeaponType.values()) {
                (ORC_ARSENAL as HashMap<WeaponType, OrcWeapon>)[type] = OrcWeapon(type)
            }
        }
    }

    override fun manufactureWeapon(weaponType: WeaponType?): Weapon? {
        return ORC_ARSENAL?.get(weaponType)
    }
}