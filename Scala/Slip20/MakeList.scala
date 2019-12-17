import scala.collection.mutable.ListBuffer
object MakeList
{
	def main(args:Array[String]):Unit={

		//make list of random 10 element 
		var random = scala.util.Random
		var list1 = List.tabulate(10)(n=>random.nextInt(100))
		
		println("Random members List:"+list1)

		var mylist= new ListBuffer[Int]()

		for(ele<- list1)
		{
			mylist += ((3*(ele*ele))+(4*ele)+6)
		}

		var list2 = mylist.toList
		println("Second List in Ascending Order:"+list2.sorted)
	}
}