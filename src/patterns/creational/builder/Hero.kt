package patterns.creational.builder


class Hero(builder: Builder) {
    var profession: String? = null
    var name: String? = null
    var hairType: String? = null
    var hairColor: String? = null
    var armor: String? = null
    var weapon: String? = null

    class Builder(profession: String?, name: String?) {
        private val profession: String
        private val name: String
        var hairType: String? = null
        var hairColor: String? = null
        var armor: String? = null
        var weapon: String? = null

        fun withHairType(hairType: String?): Builder {
            this.hairType = hairType
            return this
        }

        fun withHairColor(hairColor: String?): Builder {
            this.hairColor = hairColor
            return this
        }

        fun withArmor(armor: String?): Builder {
            this.armor = armor
            return this
        }

        fun withWeapon(weapon: String?): Builder {
            this.weapon = weapon
            return this
        }

        fun build(): Hero {
            return Hero(this)
        }

        init {
            require(!(profession == null || name == null)) { "profession and name can not be null" }
            this.profession = profession
            this.name = name
        }
    }

}