import scala.collection.mutable.Set

object SetString{

	def main(args:Array[String]):Unit=
	{
		var set1=Set("abc","pqr","xyz","klm")
		var set2 = Set("abc","xyz","mno")

		//print both sets
		println("Set1:"+set1)
		println("Set2 :"+set2)

		// get common strings
		var set3= set1.intersect(set2)
		
		//print common strings
		println("Common Strings:"+set3)
		//remove common strings
		 for( ele <- set3)
		 {
		 	set1.remove(ele)
		 	set2.remove(ele)
		 }
		 //merge after removing common strings
		 var merge = set1++=set2
		println("Resultant Set: "+merge)
	}
}