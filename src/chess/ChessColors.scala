package chess

abstract sealed class Color { def other: Color }

case object White extends Color { override def other = Black }
case object Black extends Color { override def other = White }



