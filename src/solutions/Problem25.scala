package solutions

object Problem25 {
	def main(args: Array[String]): Unit = {
		val phi: Double = 0.5 * (1 + math.sqrt(5))
		println(math.round((999 + 0.5 * math.log10(5)) / math.log10(phi)))
	}
}
