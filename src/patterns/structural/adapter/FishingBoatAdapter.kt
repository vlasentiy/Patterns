package patterns.structural.adapter


class FishingBoatAdapter : RowingBoat {
    private var boat: FishingBoat? = null

    init {
        boat = FishingBoat()
    }

    override fun row() {
        boat?.sail()
    }
}