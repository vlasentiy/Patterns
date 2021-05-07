package patterns.structural.composite

import com.sun.tools.javac.util.List
import patterns.structural.composite.LetterComposite
import patterns.structural.composite.Word
import patterns.structural.composite.Sentence

class Messenger {
    fun messageFromAndroid(): LetterComposite {
        val words: List<Word> = List.of(
            Word('G', 'o', 'o', 'g', 'l', 'e'),
            Word('I','/', 'O')
        )
        return Sentence(words)
    }

    fun messageFromIos(): LetterComposite {
        val words: List<Word> = List.of(
            Word('I', 't', '\'', 's'),
            Word('a', 'm', 'a', 'z', 'i', 'n', 'g')
        )
        return Sentence(words)
    }
}