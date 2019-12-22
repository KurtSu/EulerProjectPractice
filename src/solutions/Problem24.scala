package solutions

import tools.ToolBox

import scala.collection.mutable.ListBuffer

object Problem24 {
	def problem24(dictionary: Array[String] = Array("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"), term: Int = 1e6.toInt): String = {
		var temp = term - 1
		var currentDigit: Int = dictionary.length - 1
		var permutation: String = ""
		var tempDictionary: ListBuffer[String] = dictionary.to[ListBuffer]

		while (currentDigit >= 0) {
			val tailPermutation: Int = ToolBox.permutations(currentDigit, currentDigit)
			val index: Int = temp / tailPermutation

			temp %= tailPermutation
			permutation += tempDictionary(index)
			tempDictionary -= tempDictionary(index)
			currentDigit -= 1
		}

		permutation
	}

	def main(args: Array[String]): Unit = {
		println(problem24())
	}
}
