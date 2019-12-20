package solutions

import tools.ToolBox

/**
 * original problem: https://projecteuler.net/problem=4
 */
object Problem4 {
	/**
	 * Exhaustive method. Try every multiply of two 3-digits.
	 * Oops, a hard coded one.
	 * 12/19/2019
	 * @return
	 */
	def problem4(): Int = {
		var maxPalindrome: Int = -1
		for (i <- 100 to 999) {
			for (j <- 100 to i) {
				if (ToolBox.isPalindrome(i * j) && maxPalindrome < i * j)
					maxPalindrome = i * j
			}
		}

		maxPalindrome
	}

	def main(args: Array[String]): Unit = {
		println(problem4())
	}
}
