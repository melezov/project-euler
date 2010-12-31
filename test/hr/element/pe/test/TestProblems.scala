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
    Problem0008.solve() must equal ("40824")
  }
  def test0009() {
    Problem0009.solve() must equal ("31875000")
  }
  def test0010() {
    Problem0010.solve() must equal ("142913828922")
  }
  def test0011() {
    Problem0011.solve() must equal ("70600674")
  }
  def test0012() {
    Problem0012.solve() must equal ("76576500")
  }
  def test0013() {
    Problem0013.solve() must equal ("5537376230")
  }
  def test0014() {
    Problem0014.solve() must equal ("837799")
  }
  def test0015() {
    Problem0015.solve() must equal ("137846528820")
  }
  def test0016() {
    Problem0016.solve() must equal ("1366")
  }
  def test0017() {
    Problem0017.solve() must equal ("21124")
  }
  def test0018() {
    Problem0018.solve() must equal ("1074")
  }
  def test0019() {
    Problem0019.solve() must equal ("171")
  }
  def test0020() {
    Problem0020.solve() must equal ("648")
  }
  def test0021() {
    Problem0021.solve() must equal ("31626")
  }
  def test0022() {
    Problem0022.solve() must equal ("871198282")
  }
  def test0023() {
    Problem0023.solve() must equal ("4179871")
  }
  def test0024() {
    Problem0024.solve() must equal ("4179871")
  }
}

object TestProblems{
  def main( args: Array[String] ) {
    val ps = new ProblemSuite

    for ( i <- 23 to 23 ){
      val oldTime = System.currentTimeMillis
      ps.execute("test%04d" format i )
      val newTime = System.currentTimeMillis
      println( "Finished in: " + (newTime - oldTime) + " ms" )
    }
  }
}