package hr.element.pe.problems

import scala.annotation.tailrec
import hr.element.pe.Solveable

/**
  A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
  If all of the permutations are listed numerically or alphabetically, we call it lexicographic order.

  The lexicographic permutations of 0, 1 and 2 are: 012 021 102 120 201 210
  What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
*/
object Problem0024 extends Solveable{
  val NUMBER = 24

  def solve() = {

    def permute( list: Array[Char] ){

      @tailrec
      def maxAsc( pos: Int, max: Int ) = {

      }

      for( k <- 0 until list.length - 1 ){
        if ( list(k) < list(k + 1) ){

        }
      }
    }

    permute( "0123456789".toCharArray )

    val res = "?"
    String.valueOf( res )
  }
}
