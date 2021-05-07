package patterns.structural.composite

class Word(vararg letters: Char) : LetterComposite() {

    init {
        letters.forEach { addElement(Letter(it)) }
    }

    override fun printThisBefore() {
        print(" ")
    }
}