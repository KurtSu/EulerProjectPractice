package solutions

import scala.io.{BufferedSource, Source}

object Problem22 {
	def alphabeticalWorth(s: String): Int = {
		var sum: Int = 0

		for (c <- s)
			sum += c - 'A' + 1

		sum
	}

	def problem22(): Int = {
		val bufferedSource: BufferedSource = Source.fromFile("sources/problem22.txt")
		val firstLine: String = bufferedSource.getLines().next()
		bufferedSource.close()

		val sortedNameList: Array[String] = firstLine.split(",").map(_.drop(1)).map(_.dropRight(1)).sorted

		var sum: Int = 0

		for (i <- sortedNameList.indices)
			sum += alphabeticalWorth(sortedNameList(i)) * (i + 1)

		sum
	}

	def main(args: Array[String]): Unit = {
		println(problem22())
	}
}
