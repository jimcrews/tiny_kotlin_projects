
abstract class Piece(val position: String) {
    abstract fun print()
}
class Pawn(position: String): Piece(position) {
    override fun print() {
        println("Pawn is at position $position")
    }
}
class Queen(position: String): Piece(position) {
    override fun print() {
        println("Queen is at position $position")
    }
}

fun generatePieces(notation: List<String>): List<Piece> {
    return notation.map { piece ->
        val pieceType = piece[0] // p, or q
        val position = piece.drop(1) // a3, or c5
        when(pieceType) {
            'p' -> Pawn(position)// new Pawn
            'q' -> Queen(position) // new Queen
            else -> error("Unknown Piece!")
        }
    }
}