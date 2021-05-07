package patterns.structural.adapter


class Captain(private var rowingBoat: RowingBoat) {

    fun setRowingBoat(boat: RowingBoat) {
        this.rowingBoat = rowingBoat
    }

    fun row() {
        rowingBoat.row()
    }
}