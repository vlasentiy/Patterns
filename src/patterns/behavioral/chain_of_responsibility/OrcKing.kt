package patterns.behavioral.chain_of_responsibility


class OrcKing {
    private var chain: RequestHandler? = null

    init {
        buildChain()
    }

    private fun buildChain() {
        chain = OrcCommander(OrcOfficer(OrcSoldier(null)))
    }

    fun makeRequest(request: Request) {
        chain?.handleRequest(request)
    }
}