package hr.element.pe

trait Solveable{
  val NUMBER: Int
  def solve(): String
}

import scala.collection.mutable.HashMap
object Problems extends HashMap[Int,Solveable]

import hr.element.pe.problems._

object RunProblem{
  def main( args: Array[String] ) {
    println( Problem0009.solve() )
  }
}

