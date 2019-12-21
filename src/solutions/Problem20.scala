package solutions

object Problem20 {
	def fac(n: Int): BigInt = {
		var product: BigInt = 1

		for (i <- 1 to n)
			product *= i

		product
	}

	def problem20(): Int =
		Problem16.count(fac(100)).toInt

	def main(args: Array[String]): Unit = {
		println(problem20())
	}
}
