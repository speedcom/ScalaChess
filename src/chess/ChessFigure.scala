package chess


abstract sealed class Figure(symb: Char, un: Char) {
  val color: Color
  val symbol = (if(color == White) symb else symb-0x20).toChar
  val u = (if(color == White) un else un+6).toChar
}

case class King  (override val color: Color) extends Figure('k',0x2654)
case class Queen (override val color: Color) extends Figure('q',0x2655)
case class Rook  (override val color: Color) extends Figure('r',0x2656)
case class Bishop(override val color: Color) extends Figure('b',0x2657)
case class Knight(override val color: Color) extends Figure('n',0x2658)
case class Pawn  (override val color: Color) extends Figure('p',0x2659)	