package solutions

/**
 * original problem: https://projecteuler.net/problem=6
 */
object Problem6 {
	/**
	 * Use the closed form to compute the sum of an arithmetic sequence and a square number sequence.
	 * 12/19/2019
	 * @param n the total terms of the sequence.
	 * @return
	 */
	def problem6(n: Int = 100): Long = {
		val arithmeticSum: Int => Long = (m: Int) => ((1 + m) * m) / 2
		val squareSum: Int => Long = (m: Int) => (m * (m + 1) * (2 * m + 1)) / 6

		arithmeticSum(n) * arithmeticSum(n) - squareSum(n)
	}

	def main(args: Array[String]): Unit = {
		println(problem6())
	}
}
