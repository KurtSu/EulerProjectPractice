package solutions

import tools.ToolBox

/**
 * original problem: https://projecteuler.net/problem=10
 */
object Problem10 {
	/**
	 * 12/19/2019
	 * @param upperBound The upper bound of prime number.
	 * @return
	 */
	def problem10(upperBound: Int = 2e6.toInt): Long = {
		var sum: Long = 0
		var currentNumber: Long = 2

		while (currentNumber < upperBound) {
			if (ToolBox.isPrime(currentNumber)) {
				sum += currentNumber
			}

			currentNumber += 1
		}

		sum
	}

	def main(args: Array[String]): Unit = {
		println(problem10())
	}
}
