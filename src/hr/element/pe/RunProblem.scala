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
    println( Problem0041.solve() )
  }
}

}
package hr.element.pe.problems {

import scala.annotation.tailrec
import hr.element.pe.Solveable

import scala.collection.immutable.ListSet
import scala.collection.mutable.HashMap

/**
  We shall say that an n-digit number is pandigital if it makes use of all the
    digits 1 to n exactly once. For example, 2143 is a 4-digit pandigital and is
    also prime.

  What is the largest n-digit pandigital prime that exists?
 */
object Problem0041 extends Solveable{
  val NUMBER = 41

  def solve() = {

//    val a = Problem0024.permute( "12345".toCharArray, 1 )
//    println( a.toList );

    @tailrec
    def seekMaxPrimePermutations( digits: Array[Char], count: Long = 0 ):Long = {
      //val n = digits.mkString.toInt

      println( digits.mkString, count )

      try{
        Problem0024.permute( digits, 0 )
      }
      catch{
        case e =>
          println( e )
          return count
      }

      seekMaxPrimePermutations( digits, count+1 )
    }

    for ( n <- 1 to 9 ){
      val digits = (1 to n).mkString.toCharArray

      val cnt = seekMaxPrimePermutations( digits )

      println( n, digits.mkString, cnt )
    }

    val res = "?"
    String.valueOf( res )
  }
}

}
