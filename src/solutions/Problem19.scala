package solutions

object Problem19 {
	def isLeapYear(n: Int): Boolean =
		(n % 4 == 0 & n % 100 != 0) || (n % 400 == 0)

	def daysInMonth(yr: Int, mo: Int): Int = {
		mo match {
			case 4 | 6 | 11 | 9 => 30
			case 2 =>
				if (isLeapYear(yr)) 29
				else 28
			case _ => 31
		}
	}

	def problem19(): Int = {
		var counter: Int = 0
		var firstDayOfAMonth: Int = 2

		for (yr <- 1901 to 2000) {
			for (mo <- 1 to 12) {
				if (firstDayOfAMonth == 0)
					counter += 1

				firstDayOfAMonth = (firstDayOfAMonth + daysInMonth(yr, mo)) % 7
			}
		}

		counter
	}

	def main(args: Array[String]): Unit = {
		println(problem19())
	}
}
