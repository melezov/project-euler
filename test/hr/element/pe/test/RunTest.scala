package hr.element.pe.test

import org.scalatest.Suite
import org.scalatest.SuperSuite
import org.scalatest.matchers.MustMatchers

import hr.element.pe.problems._

class ProblemSuite extends Suite with MustMatchers{
  def test0001() {
    Problem0001.solve() must equal ("233168")
  }
  def test0002() {
    Problem0002.solve() must equal ("4613732")
  }
  def test0003() {
    Problem0003.solve() must equal ("6857")
  }
  def test0004() {
    Problem0004.solve() must equal ("?")
  }
}

object TestProblem{
  def main( args: Array[String] ) {
    val ps = new ProblemSuite

    for ( i <- 1 to 2 )
      ps.execute("test%04d" format i )
  }
}