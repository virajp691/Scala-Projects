object Quicksort{
	def main(args: Array[String]) {
		var A = Array(44, 75, 23, 43, 55, 12, 64, 77, 33)
		var foo = 0;
		for(foo <- A){
			print(foo + " ")
		}
		println()
		sort(A)
		for(foo <- A){
			print(foo + " ")
		}
		println()
	}

	def sort(xs: Array[Int]) {
		def swap(i: Int, j: Int) {
			val t = xs(i); xs(i) = xs(j); xs(j) = t
		}
		def sort1(l: Int, r: Int) {
			val pivot = xs((l + r) / 2)
			var i = l; var j = r
			while (i <= j) {
				while (xs(i) < pivot) i += 1
				while (xs(j) > pivot) j -= 1
				if (i <= j) {
					swap(i, j)
					i += 1
					j -= 1
				}
			}
			if (l < j) sort1(l, j)
			if (j < r) sort1(i, r)
		}
		sort1(0, xs.length - 1)
	}
}