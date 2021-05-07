package patterns.creational.prototype


class OrcWarlord : Warlord {
    private var weapon: String?

    constructor(weapon: String?) {
        this.weapon = weapon
    }

    constructor(orcWarlord: OrcWarlord) : super(orcWarlord) {
        weapon = orcWarlord.weapon
    }

    override fun copy(): Warlord {
        return OrcWarlord(this)
    }

    override fun toString(): String {
        return "Orcish warlord attacks with $weapon"
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
        val other = obj as OrcWarlord
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