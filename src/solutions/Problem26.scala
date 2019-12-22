package solutions

object Problem26 {
	def base10Power(n: Int): BigInt = {
		var product: BigInt = 1

		for (_ <- 0 until n)
			product *= 10

		product
	}

	//not so smart but it works.
	def cyclesLength(n: Int): Int = {
		if (n == 1)
			0

		else if (n % 2 == 0)
			cyclesLength(n / 2)

		else if (n % 5 == 0)
			cyclesLength(n / 5)

		else {
			for (i <- 1 to n - 2) {
				val denominator: BigInt = base10Power(i) - 1
				if (denominator % n == 0)
					return i
			}

			n - 1
		}
	}

	def problem26(): Int = {
		var maxCycle: Int = 0
		var maxCycleN: Int = 0

		for (i <- 2 until 1000) {
			val length: Int = cyclesLength(i)
			if (length > maxCycle) {
				maxCycle = length
				maxCycleN = i
			}
		}

		maxCycleN
	}

	def main(args: Array[String]): Unit = {
		println(problem26())
	}
}
