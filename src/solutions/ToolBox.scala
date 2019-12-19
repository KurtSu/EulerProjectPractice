package solutions

import scala.collection.mutable.ListBuffer

object ToolBox {
	def isPrime(n: Long): Boolean = {
		if (n % 2 == 0 & n > 2)
			false

		else {
			var factor: Int = 3

			while (factor <= math.sqrt(n)) {
				if (n % factor == 0)
					return false
				factor += 2
			}

			true
		}
	}
	/**
	 *
	 * @param n
	 * @return
	 */
	def factorization(n: Long): List[Long] = {
		val retVal: ListBuffer[Long] = ListBuffer()
		var temp: Long = n

		while (temp % 2 == 0) {
			retVal += 2
			temp /= 2
		}

		var factor: Long = 3
		while (factor <= temp) {
			while (temp % factor == 0) {
				retVal += factor
				temp /= factor
			}

			factor += 2
		}

		retVal.toList
	}

	def isPalindrome(n: Int): Boolean = {
		var reversedN: Int = 0
		var temp: Int = n

		while (temp > 0) {
			reversedN *= 10
			reversedN += temp % 10
			temp /= 10
		}

		reversedN == n
	}


	def gcd(m: Long, n: Long): Long = {
		@scala.annotation.tailrec
		def gcdHelper(a: Long, b: Long): Long = {
			if (b == 0)
				a
			else
				gcdHelper(b, a % b)
		}

		gcdHelper(math.max(m, n), math.min(m, n))
	}

	def lcm(m: Long, n: Long): Long = {
		m * n / gcd(m, n)
	}


}
