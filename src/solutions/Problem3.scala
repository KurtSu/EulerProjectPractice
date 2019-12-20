package solutions

import tools.ToolBox

/**
 * original problem: https://projecteuler.net/problem=3
 */
object Problem3 {
	/**
	 * Find all factors of the number n and return the greatest one.
	 * @param n the number.
	 * @return
	 */
	def problem3(n: Long = 600851475143L): Long = {
		ToolBox.factorization(n).last
	}

	def main(args: Array[String]): Unit = {
		println(problem3())
	}
}
