import scala.collection.mutable.Set
object PerfectSum{

	def main(args:Array[String]):Unit=
	{
		var set1 =  Set[Int]()
		var sum=0;
		for(i<-1 to 100)
		{	sum=0

			for(j<-1 until i)
			{
				if(i % j == 0)
				{
					sum+=j
				}
			}
			if(sum==i)
			{
				set1+=i
			}
		}

		println("Perfect Numbers are:"+set1)
		println("Sum of Perfect Numbers:"+set1.sum)
	}
}