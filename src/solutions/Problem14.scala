package solutions

/**
 * original problem: https://projecteuler.net/problem=13
 */
object Problem14 {
	def collatzChainLength(n: Long): Int = {
		var temp: Long = n
		var length: Int = 0

		while (temp != 1) {
			if (temp < 0)
				println(temp)
			length += 1
			if (temp % 2 == 1)
				temp = 3 * temp + 1
			else
				temp /= 2
		}

		length
	}

	def problem14(): Int = {
		var maxLength: Int = 0
		var maxStarting: Int = 0
		for (i <- 2 until 1e6.toInt) {
			if (collatzChainLength(i) > maxLength) {
				maxLength = collatzChainLength(i)
				maxStarting = i
			}
		}

		maxStarting
	}

	def main(args: Array[String]): Unit = {
		println(problem14())
	}
}
