package patterns.creational.prototype


class OrcMage : Mage {
    private var weapon: String?

    constructor(weapon: String?) {
        this.weapon = weapon
    }

    constructor(orcMage: OrcMage) : super(orcMage) {
        weapon = orcMage.weapon
    }

    override fun copy(): Mage {
        return OrcMage(this)
    }

    override fun toString(): String {
        return "Orcish mage attacks with $weapon"
    }

    override fun equals(obj: Any?): Boolean {
        if (this === obj) {
            return true
        }
        if (!super.equals(obj)) {
            return false
        }
        if (javaClass != obj.javaClass) {
            return false
        }
        val other = obj as OrcMage
        if (weapon == null) {
            if (other.weapon != null) {
                return false
            }
        } else if (weapon != other.weapon) {
            return false
        }
        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + (weapon?.hashCode() ?: 0)
        return result
    }
}