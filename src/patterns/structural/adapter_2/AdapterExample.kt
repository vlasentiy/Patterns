package patterns.structural.adapter_2


class AdapterExample {
    init {
        // Круглое к круглому — всё работает.

        // Круглое к круглому — всё работает.
        val hole = RoundHole(5.0)
        val roundPeg = RoundPeg(5.0)
        if (hole.fits(roundPeg)) {
            println("Round peg r5 fits round hole r5.")
        }

        val smallSqPeg = SquarePeg(2.0)
        val largeSqPeg = SquarePeg(20.0)
        // hole.fits(smallSqPeg); // Не скомпилируется.

        // Адаптер решит проблему.
        val smallSqPegAdapter = SquarePegAdapter(smallSqPeg)
        val largeSqPegAdapter = SquarePegAdapter(largeSqPeg)
        if (hole.fits(smallSqPegAdapter)) {
            println("Square peg w2 fits round hole r5.")
        }
        if (!hole.fits(largeSqPegAdapter)) {
            println("Square peg w20 does not fit into round hole r5.")
        }
    }
}