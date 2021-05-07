package patterns.behavioral.chain_of_responsibility


class OrcOfficer(request: RequestHandler?) : RequestHandler(request) {
    override fun handleRequest(request: Request) {
        if (RequestType.TORTURE_PRISONER == request.requestType) {
            printHandling(request)
            request.markHandled()
        } else {
            super.handleRequest(request)
        }
    }

    override fun toString(): String {
        return "Orc officer"
    }
}