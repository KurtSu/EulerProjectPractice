package solutions

object Problem16 {
	def twoToTheN(n: Int): BigInt = {
		var product: BigInt = 1
		for (_ <- 1 to n)
			product *= 2

		product
	}

	def count(n: BigInt): BigInt = {
		var sum: BigInt = 0
		var temp: BigInt = n
		while (temp > 0) {
			sum += temp % 10
			temp /= 10
		}

		sum
	}

	def main(args: Array[String]): Unit = {
		println(count(twoToTheN(1000)))
	}
}
