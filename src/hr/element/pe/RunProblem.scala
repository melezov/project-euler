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
    println( Problem0051.solve() )
  }
}

package problems {

/**
  By replacing the 1st digit of *3, it turns out that six of the nine possible
    values: 13, 23, 43, 53, 73, and 83, are all prime.

  By replacing the 3rd and 4th digits of 56**3 with the same digit, this 5-digit
    number is the first example having seven primes among the ten generated
    numbers, yielding the family: 56003, 56113, 56333, 56443, 56663, 56773, and
    56993. Consequently 56003, being the first member of this family, is the
    smallest prime with this property.

  Find the smallest prime which, by replacing part of the number (not
  necessarily adjacent digits) with the same digit, is part of an eight prime
  value family.
*/
object Problem0051 extends Solveable{
  val NUMBER = 51

  def solve() = {

    val primes = Problem0010.getPrimes( 99999 )

    def countPrimality( family: String ) = {
      ('0' to '9').count( // '*', i ).toInt

    }

    def findMinimumWildcard8Prime( cur: Int ) = {
      val len = cur.toString.length
      len
    }

    val res = findMinimumWildcard8Prime( 2 )
    String.valueOf( res )
  }
}

}