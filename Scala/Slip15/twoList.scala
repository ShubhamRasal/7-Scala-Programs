import scala.collection.mutable.ListBuffer
import scala.math.sqrt

//perfect square
//sqrt 1 = 1 since 1^2 =1
//sqrt 4 = 2 since 2^2 =4
//sqrt 9 = 3 since 3^2 =9
//sqrt 16= 4 since 4^2 =16
object twoList{

	def  main(args:Array[String]):Unit={
		println("Hello World")

		var list1= List.range(1,101)
		var list2= new ListBuffer[Int]()

		println("List 1: "+list1)
		var root=0;

		for(ele <- list1)
		{
			root = sqrt(ele).toInt
			if((root*root) == ele)
			{
				list2+=ele
			}	
		}

		val mylist= list2.toList
		
		println("*****************************************************************")
		println("List of perfect square:"+mylist)

	}
}