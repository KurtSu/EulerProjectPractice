package solutions

import scala.collection.mutable.ListBuffer
import scala.io.{BufferedSource, Source}

object Problem18 {
	val HEIGHT: Int = 15
	val TRIANGLE: List[List[Int]] = {
		val temp: ListBuffer[List[Int]] = ListBuffer()
		val bufferedSource: BufferedSource = Source.fromFile("sources/problem18.txt")

		for (line <- bufferedSource.getLines())
			temp += line.split(" ").toList.map(_.toInt)

		bufferedSource.close()
		temp.toList
	}

	def maxTotal(triangle: List[List[Int]], row: Int, column: Int, height: Int): Int = {
		if (row == height - 1)
			triangle(row)(column)

		else
			triangle(row)(column) + math.max(maxTotal(triangle, row + 1, column, height), maxTotal(triangle, row + 1, column + 1, height))
	}

	def main(args: Array[String]): Unit = {
		println(maxTotal(TRIANGLE, 0, 0, HEIGHT))
	}

}
