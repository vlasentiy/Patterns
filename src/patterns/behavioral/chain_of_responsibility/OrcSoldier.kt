package patterns.behavioral.chain_of_responsibility


class OrcSoldier(handler: RequestHandler?) : RequestHandler(handler) {
    override fun handleRequest(request: Request) {
        if (RequestType.COLLECT_TAX == request.requestType) {
            printHandling(request)
            request.markHandled()
        } else {
            super.handleRequest(request)
        }
    }

    override fun toString(): String {
        return "Orc soldier"
    }
}