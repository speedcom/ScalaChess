package chess
import collection.immutable._

case class Field(col: Int, row: Int) {
	def this(s: Symbol) = this(s.toString()(1)-'a'+1, s.toString()(2)-'1'+1)
	def colSymbol = (col + 'a' - 1).toChar
	def isLastRow(color: Color) = row == Field.firstRow(color.other) 
	def isValid = col >= 1 && col <= 8 && row >= 1 && row <= 8
	def relative(c: Int, r: Int) = new Field(col+c, row+r)
	override def toString = colSymbol.toString + row
}
object Field {
	implicit def symbol2Field(field: Symbol): Field = new Field(field)
	def firstRow(color: Color)= if (color == White) 1 else 8 
}