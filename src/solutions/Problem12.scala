package solutions

import tools.ToolBox

/**
 * original problem: https://projecteuler.net/problem=12
 */
object Problem12 {
	/**
	 * 12/19/2019
	 * @param numberOfDivisors the lower bound of numbers of divisors.
	 * @return
	 */
	def problem12(numberOfDivisors: Int = 500): Long = {
		var index: Int = 1
		var divisorSet: Set[Long] = ToolBox.divisorsSet(ToolBox.triangleNumber(index))
		while (divisorSet.size <= numberOfDivisors) {
			index += 1
			divisorSet = ToolBox.divisorsSet(ToolBox.triangleNumber(index))
		}

		ToolBox.triangleNumber(index)
	}

	def main(args: Array[String]): Unit = {
		println(problem12())
	}
}
