package solutions

object Solutions {

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


	/**
	 * Compute all fibonacci numbers smaller than upperBound. If the number is even, add it to the sum.
	 * 12/19/2019
	 * @param upperBound the upper bound of the number range. In this problem it is 4e6.
	 * @return
	 */
	def problem2(upperBound: Int = 4e6.toInt): Int = {
		var sum: Int = 0

		def fibonacciHelper(index: Int): Int = {
			index match {
				case 1 => 1
				case 2 => 2
				case _ => fibonacciHelper(index - 2) + fibonacciHelper(index - 1)
			}
		}

		var nextFibonacci: Int = -1
		var indexFibonacci: Int = 1
		while (nextFibonacci < upperBound) {
			nextFibonacci = fibonacciHelper(indexFibonacci)
			indexFibonacci += 1
			if (nextFibonacci % 2 == 0)
				sum += nextFibonacci
		}

		sum
	}

	/**
	 *
	 * @param n
	 * @return
	 */
	def problem3(n: Long): Long = {
		ToolBox.factorization(n).last
	}


	/**
	 * oops, a hard coded one.
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


	/**
	 *
	 * @param upperBound
	 * @return
	 */
	def problem5(upperBound: Int = 20): Long = {
		var totalLcm: Long = 1

		for (i <- 1 to upperBound) {
			totalLcm = ToolBox.lcm(totalLcm, i)
		}

		totalLcm
	}


	def problem6(n: Int = 100): Long = {
		val arithmeticSum: Int => Long = (m: Int) => ((1 + m) * m) / 2
		val squareSum: Int => Long = (m: Int) => (m * (m + 1) * (2 * m + 1)) / 6

		arithmeticSum(n) * arithmeticSum(n) - squareSum(n)
	}


	def problem7(upperBound: Int = 10001): Long = {
		var currentIndex: Int = 1
		var currentNumber: Long = 1
		while(currentIndex != upperBound) {
			currentNumber += 2
			if (ToolBox.isPrime(currentNumber)) {
				currentIndex += 1
			}
		}

		currentNumber
	}

	def problem8(digits: Int = 13): BigInt = {
		val theNumber: String = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450"

		def stringCalculator(s: String): BigInt = {
			var product: BigInt = 1

			for (i <- s)
				product *= i - '0'

			product
		}

		var maxProduct: BigInt = 0

		for (startIndex <- 0 until theNumber.length - digits) {
			if (maxProduct < stringCalculator(theNumber.substring(startIndex, startIndex + digits))) {
				maxProduct = stringCalculator(theNumber.substring(startIndex, startIndex + digits))
			}
		}

		maxProduct
	}
}
