object ListFunctions {
	def main(args: Array[String]) {
		var foo = List(1, 2, 3, 5, 8)
		println(foo.toString())

		
		println("Last Element of List: " + last(foo))
		println("Last but one element: " + penultimate(foo))
		println("The 3rd element is: " + kth(3, foo))
		println("The length of list: " + foo.length)
		println("Reverse of list: " + (revList(foo)).toString())
	}

	// Return the last element of the list
	def last[A](ls: List[A]): A = ls.last
	// Return the n-1 element of the list
	def penultimate[A](ls: List[A]): A = {
		ls(ls.length - 2)
	}
	// Return the kth element in the list
	def kth[A](k: Int ,ls: List[A]): A = {
		if (k >= 0 && k<= ls.length) ls(k)
		else throw new NoSuchElementException
	}
	// Return reverse of list
	def revList[A](ls: List[A]): List[A] =	ls.reverse

}