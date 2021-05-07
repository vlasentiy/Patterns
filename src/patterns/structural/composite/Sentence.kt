package patterns.structural.composite

class Sentence(words: List<Word>) : LetterComposite() {

    init {
        words.forEach { addElement(it) }
    }

    override fun play() {
        super.play()
        println(".")
    }

    override fun printThisAfter() {
        //println(".")
    }
}