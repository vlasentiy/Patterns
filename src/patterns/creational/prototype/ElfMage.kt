package patterns.creational.prototype


class ElfMage : Mage {
    private var helpType: String?

    constructor(helpType: String?) {
        this.helpType = helpType
    }

    constructor(elfMage: ElfMage) : super(elfMage) {
        helpType = elfMage.helpType
    }

    override fun copy(): Mage {
        return ElfMage(this)
    }

    override fun toString(): String {
        return "Elven mage helps in $helpType. Price is $price coins"
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
        val other = obj as ElfMage
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