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
    println( Problem0035.solve() )
  }
}

}
package hr.element.pe.problems {

import scala.annotation.tailrec
import hr.element.pe.Solveable

import scala.collection.immutable.ListSet
import scala.collection.mutable.HashMap

/**
  The number, 197, is called a circular prime because all rotations of the
    digits: 197, 971, and 719, are themselves prime.

  There are thirteen such primes below 100:
    2, 3, 5, 7, 11, 13, 17, 31, 37, 71, 73, 79, and 97.

  How many circular primes are there below one million?
*/
object Problem0035 extends Solveable{
  val NUMBER = 35

  def solve() = {

    def rot( text: String ):Stream[String] = {
      val cur = text.tail + text.head
      cur #:: rot(cur)
    }

    def getPrimes( limit: Int ) = {
      val primes = (0 until limit toArray)
      primes(1) = 0

      for ( i <- 2 until ( limit >> 1 ) ){
        val cur = primes(i)
        if ( cur != 0 ){
          for ( r <- ( cur << 1 ) until limit by cur ){
            primes(r) = 0
          }
        }
      }

      val b = primes.filter(_!=0).toList
      println(b)

      val a= ListSet.empty ++ b
      println(a)

      a.toList.sortBy(identity)
    }

    def findCircularPrimes( limit: Int ) = {
      val primes = getPrimes( limit )
      println(primes)
      primes.count{ n =>
        val cur = n.toString
        false
        //rot( cur ).view.take( cur.length ).map(_.toInt).forall(primes.contains(_))
      }
    }

    val res = findCircularPrimes( 100 )
    String.valueOf( "res" )
  }
}

}
