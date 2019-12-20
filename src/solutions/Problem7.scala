package solutions

import tools.ToolBox

/**
 * original problem: https://projecteuler.net/problem=7
 */
object Problem7 {
	/**
	 * 12/19/2019
	 * @param index The index of a prime number.
	 * @return
	 */
	def problem7(index: Int = 10001): Long = {
		var currentIndex: Int = 1
		var currentNumber: Long = 1
		while(currentIndex != index) {
			currentNumber += 2
			if (ToolBox.isPrime(currentNumber)) {
				currentIndex += 1
			}
		}

		currentNumber
	}

	def main(args: Array[String]): Unit = {
		println(problem7())
	}
}
