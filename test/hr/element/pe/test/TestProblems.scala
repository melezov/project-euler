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
    Problem0024.solve() must equal ("2783915460")
  }
  def test0025() {
    Problem0025.solve() must equal ("4782")
  }
  def test0026() {
    Problem0026.solve() must equal ("983")
  }
  def test0027() {
    Problem0027.solve() must equal ("-59231")
  }
  def test0028() {
    Problem0028.solve() must equal ("669171001")
  }
  def test0029() {
    Problem0029.solve() must equal ("9183")
  }
  def test0030() {
    Problem0030.solve() must equal ("443839")
  }
  def test0031() {
    Problem0031.solve() must equal ("73682")
  }
  def test0032() {
    Problem0032.solve() must equal ("45228")
  }
  def test0033() {
    Problem0033.solve() must equal ("100")
  }
  def test0034() {
    Problem0034.solve() must equal ("40730")
  }
  def test0035() {
    Problem0035.solve() must equal ("55")
  }
  def test0036() {
    Problem0036.solve() must equal ("872187")
  }
  def test0037() {
    Problem0037.solve() must equal ("748317")
  }
  def test0038() {
    Problem0038.solve() must equal ("932718654")
  }
  def test0039() {
    Problem0039.solve() must equal ("840")
  }
  def test0040() {
    Problem0040.solve() must equal ("210")
  }
  def test0041() {
    Problem0041.solve() must equal ("?")
  }
}

object TestProblems{
  def main( args: Array[String] ) {
    val ps = new ProblemSuite

    for ( i <- 40 to 40 ){
      val oldTime = System.currentTimeMillis
      ps.execute("test%04d" format i )
      val newTime = System.currentTimeMillis
      println( "Finished in: " + (newTime - oldTime) + " ms" )
    }
  }
}