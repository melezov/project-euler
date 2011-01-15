package hr.element.pe {

trait Solveable{
  val NUMBER: Int
  def solve(): String
}

import scala.collection.mutable.HashMap

object Problems extends HashMap[Int,Solveable]

import hr.element.pe.problems._

object RunProblem{
  def main( args: Array[String] ) {
    println( Problem0036.solve() )
  }
}

}
package hr.element.pe.problems {

import scala.annotation.tailrec
import hr.element.pe.Solveable

import scala.collection.immutable.ListSet
import scala.collection.mutable.HashMap


}
