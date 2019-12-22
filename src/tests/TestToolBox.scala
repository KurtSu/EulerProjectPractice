package tests

import org.scalatest.FunSuite
import tools.ToolBox

class TestToolBox extends FunSuite {
	test("Always pass") {
		assert(true)
	}

	test("permutations 1") {
		assert(12 == ToolBox.permutations(4, 2))
	}

	test("permutations 2") {
		assert(1 == ToolBox.permutations(10, 0))
	}

	test("permutations 3") {
		assert(120 == ToolBox.permutations(5, 5))
	}
}

