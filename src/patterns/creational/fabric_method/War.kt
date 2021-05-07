package patterns.creational.fabric_method


class War(private val blacksmith: Blacksmith) {

    init {
        manufactureWeapons()
    }

    private fun manufactureWeapons() {
        var weapon: Weapon? = blacksmith.manufactureWeapon(WeaponType.AXE)
        println(weapon.toString())
        weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR)
        println(weapon.toString())
    }
}