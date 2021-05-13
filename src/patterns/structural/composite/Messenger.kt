package patterns.structural.composite

class Messenger {
    fun messageFromAndroid(): LetterComposite {
        val words: List<Word> = listOf(
            Word('G', 'o', 'o', 'g', 'l', 'e'),
            Word('I', '/', 'O')
        )
        return Sentence(words)
    }

    fun messageFromIos(): LetterComposite {
        val words: List<Word> = listOf(
            Word('I', 't', '\'', 's'),
            Word('a', 'm', 'a', 'z', 'i', 'n', 'g')
        )
        return Sentence(words)
    }
}