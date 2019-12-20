package tools

class Timer {
	private val startTime: Long = System.currentTimeMillis()

	def timePassed(): Unit = {
		println("Running time: " + (System.currentTimeMillis() - startTime) + " ms.")
	}
}
