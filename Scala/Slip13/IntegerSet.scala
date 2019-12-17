import scala.collection.mutable.Set
object IntegerSet
{
	def main(args:Array[String]):Unit={
		println("Hello world")
		
		var set1 = Set(1,2,3,4,5)
		var set2 = Set(6,7,8,9,10)

		var set3 = set1++set2

		println("Merge Set:"+ set3)
		println("Sum:"+set3.sum)
		println("Max:"+set3.max)
		println("Min:"+set3.min)

	}
}