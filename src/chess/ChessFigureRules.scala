package chess
import collection.immutable._

object FigureRules {
  implicit def field2moves(field: Field): FigureRules = new FigureRules(field)
}

class FigureRules(field: Field) {
  private def next(c: Int, r: Int)(implicit fieldSeq: Seq[Field]): Seq[Field] = {
    val nextField = field.relative(c, r)
    if(nextField.isValid) 
      new FigureRules(nextField).next(c,r)(fieldSeq ++ Seq(nextField))
    else
      fieldSeq
  }
}