package tests

import org.scalatest.FunSuite
import solutions.{Solutions, ToolBox}

class Test extends FunSuite{
	test("problem 1") {
		assert(23 == Solutions.problem1(10))
	}

	test("problem 3") {
		assert(29 == Solutions.problem3(13195))
	}

	test("problem 5") {
		assert(2520 == Solutions.problem5(10))
	}

	test("problem 6") {
		assert(2640 == Solutions.problem6(10))
	}

	test("problem 7") {
		assert(13 == Solutions.problem7(6))
	}

	test("problem 8") {
		assert(5832 == Solutions.problem8(4))
	}
}

