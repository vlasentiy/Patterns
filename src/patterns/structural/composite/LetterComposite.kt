package patterns.structural.composite

import java.util.ArrayList

abstract class LetterComposite {
    private val elements: MutableList<LetterComposite> = ArrayList()

    fun addElement(element: LetterComposite) {
        elements.add(element)
    }

    open fun printThisBefore() {}
    open fun printThisAfter() {}

    open fun play() {
        printThisBefore()
        elements.forEach { it.play() }
        printThisAfter()
    }
}