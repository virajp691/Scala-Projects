object ComplexNumbers {
	def main(args: Array[String]) {
		val c = new Complex(1.2, 3.4)
		//println("imaginary part: " + c.im)
		println(c)
	}
}

class Complex(real: Double, imaginary: Double) {
	/*
	Could use re(), im() if refering to functions. In case of fields
	abstain parentheses. 
	*/
	def re = real
	def im = imaginary

	// Override std.string method for unknown objects of this class type
	override def toString() =
		"" + re + (if (im < 0) "" else "+") + im + "i"
}
