package patterns.creational.fabric_method


interface Blacksmith {
    fun manufactureWeapon(weaponType: WeaponType?): Weapon?
}