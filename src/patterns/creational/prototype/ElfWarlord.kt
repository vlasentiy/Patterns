package patterns.creational.prototype

class ElfWarlord : Warlord {
    private var helpType: String?

    constructor(helpType: String?) {
        this.helpType = helpType
    }

    constructor(elfWarlord: ElfWarlord) : super(elfWarlord) {
        helpType = elfWarlord.helpType
    }

    override fun copy(): ElfWarlord {
        return ElfWarlord(this)
    }

    override fun toString(): String {
        return "Elven warlord helps in $helpType"
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
        val other = obj as ElfWarlord
        if (helpType == null) {
            if (other.helpType != null) {
                return false
            }
        } else if (helpType != other.helpType) {
            return false
        }
        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + (helpType?.hashCode() ?: 0)
        return result
    }


}