package solutions

object Problem15 {
	val size: Int = 20
	val result: Array[Array[BigInt]] = Array.ofDim[BigInt](size + 1, size + 1)

	def paths(m: Int, n: Int): BigInt = {
		if (m == 0) {
			result(m)(n) = 1
			1
		}

		else if (n == 0) {
			result(m)(n) = 1
			1
		}

		else {
			if (result(m)(n) != null)
				result(m)(n)

			else {
				result(m - 1)(n) = paths(m - 1, n)
				result(m)(n - 1) = paths(m, n - 1)

				paths(m - 1, n) + paths(m, n - 1)
			}
		}
	}

	def main(args: Array[String]): Unit = {
		println(paths(size, size))
	}
}
