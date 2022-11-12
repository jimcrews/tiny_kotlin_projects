
fun main(args: Array<String>) {
    //runSingleton()
    runFactory()
}

// Factory Pattern
// Create objects from configuration files or string (below)
fun runFactory() {
    // config of chess positions - pawn at a3 and queen at c5
    val notation = listOf("pa3", "qc5")
    val pieces : List<Piece> = generatePieces(notation)
    for(p in pieces) {
        p.print()
    }
}

// Singleton Pattern
// We need only one instance of the class like NetworkService, DatabaseService, etc.
fun runSingleton() {
    Singleton.printVarName()
    Singleton.variableName = "New Name"
    var a = A()
}