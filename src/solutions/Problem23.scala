package solutions

import tools.ToolBox

import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks._

object Problem23 {
	val UPPER_BOUND: Int = 28123

	def isAbundant(n: Int): Boolean =
		ToolBox.divisorsSet(n).sum - n > n

	val abundantList: Array[Int] = {
		val temp: ListBuffer[Int] = ListBuffer()

		for (i <- 2 to UPPER_BOUND)
			if (isAbundant(i))
				temp += i

		temp.toList.toArray
	}

	def problem23(): Int = {
		var twoAbundantSums: Set[Int] = Set()

		for (i <- abundantList.indices) {
			breakable {
				for (j <- i until abundantList.length) {
					twoAbundantSums += (abundantList(i) + abundantList(j))

					if (abundantList(i) + abundantList(j) > UPPER_BOUND || abundantList(i) + abundantList(j) < 0)
						break
				}
			}
		}

		var sum: Int = 0

		for (i <- 1 to UPPER_BOUND)
			if (!twoAbundantSums.contains(i))
				sum += i

		sum
	}

	def main(args: Array[String]): Unit = {
		println(problem23())
	}
}
