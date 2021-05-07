package patterns.creational.fabric_method.orc

import patterns.creational.fabric_method.Weapon
import patterns.creational.fabric_method.WeaponType


class OrcWeapon(private val weaponType: WeaponType) : Weapon {

    override fun getWeaponType(): WeaponType? {
        return weaponType
    }

    override fun toString(): String {
        return "OrcWeapon $weaponType"
    }
}