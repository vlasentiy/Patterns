package patterns.behavioral.chain_of_responsibility


class Request(var requestType: RequestType, var requestDescription: String) {
    private var handled: Boolean = false

    fun markHandled() {
        handled = true
    }

    fun isHandled(): Boolean = handled

    override fun toString(): String {
        return requestDescription
    }
}