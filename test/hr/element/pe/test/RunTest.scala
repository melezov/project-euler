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
    Problem0004.solve() must equal ("906609")
  }
  def test0005() {
    Problem0005.solve() must equal ("232792560")
  }
  def test0006() {
    Problem0006.solve() must equal ("25164150")
  }
  def test0007() {
    Problem0007.solve() must equal ("104743")
  }
  def test0008() {
    Problem0008.solve() must equal ("?")
  }
}

object TestProblem{
  def main( args: Array[String] ) {
    val ps = new ProblemSuite

    for ( i <- 1 to 8 )
      ps.execute("test%04d" format i )
  }
}