package patterns.creational.fabric_method.elf

import patterns.creational.fabric_method.Weapon
import patterns.creational.fabric_method.WeaponType


class ElfWeapon(private var weaponType: WeaponType) : Weapon {

    override fun getWeaponType(): WeaponType? {
        return weaponType
    }

    override fun toString(): String {
        return "Elven $weaponType"
    }
}