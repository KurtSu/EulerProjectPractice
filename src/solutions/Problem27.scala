package solutions

import tools.ToolBox

import scala.collection.mutable.ListBuffer

object Problem27 {
	val primeList: List[Int] = {
		val temp: ListBuffer[Int] = ListBuffer()

		for (i <- 2 to 1000)
			if (ToolBox.isPrime(i))
				temp.prepend(i, -i)

		temp.toList
	}

	def quadratic(a: Int, b: Int): Int => Int = {
		(n: Int) =>
			n * n + a * n + b
	}

	def lengthOfConsecutiveSeq(a: Int, b: Int): Int = {
		var n: Int = 0
		val q: Int => Int = quadratic(a, b)

		while (ToolBox.isPrime(q(n)))
			n += 1

		n
	}

	def problem27(): Int = {
		var maxLength: Int = 40
		var retVal: Int = 41

		for (b <- primeList) {
			for (a <- -999 to 999) {
				if (a % b != 0) {
					val currentLength: Int = lengthOfConsecutiveSeq(a, b)
					if (currentLength > maxLength) {
						maxLength = currentLength
						retVal = a * b
					}
				}
			}
		}

		retVal
	}

	def main(args: Array[String]): Unit = {
		//println(problem27())
		println(problem27())
	}
}
