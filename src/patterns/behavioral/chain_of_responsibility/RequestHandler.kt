package patterns.behavioral.chain_of_responsibility

abstract class RequestHandler(private var next: RequestHandler?) {

    open fun handleRequest(request: Request) {
        next?.handleRequest(request)
    }

    protected fun printHandling(request: Request) {
        println("${toString()} handling request ${request.requestDescription}")
    }

    abstract override fun toString(): String
}