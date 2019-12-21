package solutions

object Problem17 {
	val unitsNumbers: Array[String] = Array("", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
	val tensNumbers: Array[String] = Array("", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")
	val teensNumbers: Array[String] = Array("ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen")
	val hundred: String = "hundred"
	val and: String = "and"

	def spellOneDigits(n: Int): String =
		unitsNumbers(n)

	def spellTwoDigits(n: Int): String = {
		if (n >= 20)
			tensNumbers(n / 10) + unitsNumbers(n % 10)
		else if (n >= 10)
			teensNumbers(n % 10)
		else
			spellOneDigits(n)
	}

	def spellThreeDigits(n: Int): String = {
		if (n % 100 == 0)
			unitsNumbers(n / 100) + hundred
		else
			unitsNumbers(n / 100) + hundred + and + spellTwoDigits(n % 100)
	}

	def spellNumber(n: Int): String = {
		if (n < 10)
			spellOneDigits(n)
		else if (n < 100)
			spellTwoDigits(n)
		else if (n < 1000)
			spellThreeDigits(n)
		else
			"onethousand"
	}

	def problem17(): Int = {
		var sum: Int = 0

		for (i <- 1 to 1000)
			sum += spellNumber(i).length

		sum
	}

	def main(args: Array[String]): Unit = {
		println(problem17())
	}

}
