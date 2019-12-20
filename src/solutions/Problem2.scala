package solutions

/**
 * original problem: https://projecteuler.net/problem=2
 */
object Problem2 {
	/**
	 * Use 2 numbers to store the any 2 consequent fibonacci numbers and use them to derive the next number.
	 * For the fibonacci numbers smaller than upperBound, add it to the sum if the number is even.
	 * 12/19/2019
	 * @param upperBound the upper bound of the number range. In this problem it is 4e6.
	 * @return
	 */
	def problem2(upperBound: Int = 4e6.toInt): Int = {
		var sum: Int = 0
		var a: Int = 1
		var b: Int = 2

		while (b < upperBound) {
			if (b % 2 == 0)
				sum += b

			val temp: Int = a
			a = b
			b = temp + b
		}

		sum
	}

	def main(args: Array[String]): Unit = {
		println(problem2())
	}
}
