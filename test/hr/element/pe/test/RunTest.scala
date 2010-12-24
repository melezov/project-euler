package hr.element.pe.test

import org.scalatest.Suite
import org.scalatest.SuperSuite
import org.scalatest.matchers.MustMatchers

import hr.element.pe.problems._

class ProblemSuite extends Suite with MustMatchers{
  def test0001() {
    Problem0001.solve() must equal ("233168")
  }
}

object TestProblem{
  def main( args: Array[String] ) {
    new ProblemSuite execute("test0001")
  }
}