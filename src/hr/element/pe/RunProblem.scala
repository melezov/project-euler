package hr.element.pe

trait Solveable{
  val NUMBER: Int
  def solve(): String
  Problems.register( this )
}

import scala.collection.mutable.HashMap
object Problems extends HashMap[Int,Solveable]{
  def register( s: Solveable ) = put( s.NUMBER, s )
}

object RunProblem {
  def main( args: Array[String] ) {
    println( Problems( 1 ).solve() )
  }
}