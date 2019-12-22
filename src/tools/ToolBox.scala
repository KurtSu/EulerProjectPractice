package tools

import scala.collection.mutable.ListBuffer

object ToolBox {
	/**
	 * Check if a number is prime number or not.
	 * 12/19/2019
	 * @param n the number.
	 * @return true for prime number, false otherwise.
	 */
	def isPrime(n: Long): Boolean = {
		if (n < 0)
			isPrime(-n)

		else {
			if (n % 2 == 0 & n > 2)
				false

			else if (n == 1 || n == 0)
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
	}


	/**
	 * Find all  the factors of the number n.
	 * 12/19/2019
	 * @param n the number.
	 * @return a list contains all factorization sort from small to large. 1 is not in it.
	 */
	def factorization(n: Long): List[Long] = {
		val retVal: ListBuffer[Long] = ListBuffer()
		var temp: Long = n

		//Find all factors of 2 first.
		while (temp % 2 == 0) {
			retVal += 2
			temp /= 2
		}

		//Now only odd factors left.
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

	/**
	 * Check if a number is palindrome.
	 * 12/19/2019
	 * @param n the number.
	 * @return true for palindrome, otherwise false.
	 */
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

	/**
	 * Find the greatest common divisor of m, n.
	 * 12/19/2019
	 * @param m an integer.
	 * @param n another integer.
	 * @return  their greatest common divisor.
	 */
	def gcd(m: Long, n: Long): Long = {

		/**
		 * Euclidean algorithm. Where a >= b.
		 * @param a the greater integer.
		 * @param b the smaller integer.
		 * @return  their greatest common divisor.
		 */
		@scala.annotation.tailrec
		def gcdHelper(a: Long, b: Long): Long = {
			if (b == 0)
				a
			else
				gcdHelper(b, a % b)
		}

		gcdHelper(math.max(m, n), math.min(m, n))
	}

	/**
	 * Find the least common multiple of m, n.
	 * 12/19/2019
	 * @param m an integer.
	 * @param n another integer.
	 * @return  their least common multiple.
	 */
	def lcm(m: Long, n: Long): Long = {
		m * n / gcd(m, n)
	}

	/**
	 * Find all divisors of a number without duplicate.
	 * 12/19/2019
	 * @param n the number.
	 * @return  a set contains all n's divisors including 1 and itself.
	 */
	def divisorsSet(n: Long): Set[Long] = {
		var retVal: Set[Long] = Set(1, n)
		var divisor: Int = 2

		while (divisor <= math.sqrt(n)) {
			if (n % divisor == 0) {
				retVal += divisor
				retVal += n / divisor
			}

			divisor += 1
		}

		retVal
	}

	/**
	 * The nth triangle number. Constant time cost.
	 * 12/19/2019
	 *
	 * @param n the index number.
	 * @return the nth triangle number.
	 */
	def triangleNumber(n: Int): Long = (n * (n + 1)) / 2

	def permutations(m: Int, n: Int): Int = {
		var product: Int = 1

		for (i <- 0 until n)
			product *= m - i

		product
	}
}
