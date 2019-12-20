package solutions

import tools.ToolBox

/**
 * original problem: https://projecteuler.net/problem=5
 */
object Problem5 {
	/**
	 * The result will be the least common multiple of all numbers in the range.
	 * 12/19/2019
	 * @param upperBound The upper bound of the number range.
	 * @return
	 */
	def problem5(upperBound: Int = 20): Long = {
		var totalLcm: Long = 1

		for (i <- 1 to upperBound) {
			totalLcm = ToolBox.lcm(totalLcm, i)
		}

		totalLcm
	}

	def main(args: Array[String]): Unit = {
		println(problem5())
	}
}
