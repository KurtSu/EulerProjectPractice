package solutions

import tools.ToolBox

object Problem21 {
	def sumOfProperFactors(n: Int): Int = {
		ToolBox.divisorsSet(n).sum.toInt - n
	}

	def problem21(): Int = {
		var sum: Int = 0

		for (i <- 2 to 10000) {
			val j: Int = sumOfProperFactors(i)
			if (sumOfProperFactors(j) == i & j != i)
				sum += i
		}

		sum
	}

	def main(args: Array[String]): Unit = {
		println(problem21())
	}
}
