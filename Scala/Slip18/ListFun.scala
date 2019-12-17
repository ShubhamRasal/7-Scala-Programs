object ListFun{
	def main(args:Array[String]):Unit={

		var list1 = List.tabulate(50)(n=> (2*n) + 3)
		println("First List using function 2n+3: ")
		for(ele <- list1)
			println(ele)
		

		var list2 = list1.filter(_ %5 !=0)  // _ stands for "all elements"
		println("Second List exculding elements multiple of 5 from list1:")
		for(ele<-list2)
			println(ele)
		}
}