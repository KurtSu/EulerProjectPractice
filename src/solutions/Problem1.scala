package solutions

/**
 * original problem: https://projecteuler.net/problem=1
 */
object Problem1 {
	/**
	 * Traversal all the numbers. If a number is divisible by 3 or 5, add it to the sum, so that there is no double count.
	 * 12/19/2019
	 * @param upperBound the upper bound of the number range. In this problem it is 1000.
	 * @return
	 */
	def problem1(upperBound: Int = 1000): Int = {
		var sum: Int = 0
		for (i <- 0 until upperBound) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i
		}

		sum
	}

	def main(args: Array[String]): Unit = {
		println(problem1())
	}
}
