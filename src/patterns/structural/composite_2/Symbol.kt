package patterns.structural.composite_2

interface Symbol {
    fun play()
}

class Letter2(private val character: Char) : Symbol {
    override fun play() {
        print(character)
    }
}

class Word2(private var characters: List<Letter2>) : Symbol {
    override fun play() {
        characters.forEach { it.play() }
        print(" ")
    }
}

class Sentence2(private val words: List<Word2>) : Symbol {
    override fun play() {
        words.forEach { it.play() }
        print(".\n")
    }
}

class Text2(private val sentences: List<Sentence2>) : Symbol {
    override fun play() {
        sentences.forEach { it.play() }
    }
}

class Messenger2 {
    fun getMessages(): Symbol {

        val word1 = Word2(
            listOf(
                Letter2('h'),
                Letter2('i')
            )
        )
        val word2 = Word2(
            listOf(
                Letter2('b'),
                Letter2('r'),
                Letter2('o')
            )
        )

        val word3 = Word2(
            listOf(
                Letter2('n'),
                Letter2('o'),
                Letter2('t')
            )
        )
        val word4 = Word2(
            listOf(
                Letter2('b'),
                Letter2('a'),
                Letter2('d')
            )
        )

        return Text2(
            listOf(
                Sentence2(listOf(word1, word2)),
                Sentence2(listOf(word3, word4))
            )
        )
    }
}