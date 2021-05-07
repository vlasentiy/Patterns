package patterns.creational.simple_factory

import java.util.function.Supplier


interface Builder {
    fun add(name: WeaponType?, supplier: Supplier<Weapon?>?)
}