package patterns.structural.composite

import patterns.structural.composite.LetterComposite

class Letter(private val character: Char) : LetterComposite() {
    override fun printThisBefore() {
        print(character)
    }
}