package patterns.behavioral.chain_of_responsibility


class OrcCommander(requestHandler: RequestHandler?) : RequestHandler(requestHandler) {
    override fun handleRequest(request: Request) {
        if (RequestType.DEFEND_CASTLE == request.requestType) {
            printHandling(request)
            request.markHandled()
        } else {
            super.handleRequest(request)
        }
    }

    override fun toString(): String {
        return "Orc commander"
    }
}