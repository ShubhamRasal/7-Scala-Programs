import scala.io.StdIn._

object Conversion{

	def printBinary(no:Int):Unit={
		var x=no
		var arr=new Array[Int](8)
		var i=0
		while(x!=0)
		{
			arr(i)=x%2
			x=x/2
			i+=1
		}

		print("Binay of "+no+" :")
		for(i<-i-1 to 0 by -1)
		{
			print(arr(i))
		}
		println()
	}
	def printOctal(no:Int):Unit={
		var x=no
		var arr=new Array[Int](5)
		var i=0
		while(x!=0)
		{
			arr(i)=x%8
			x=x/8
			i+=1
		}

		print("Octal of "+no+" :")
		for(i<-i-1 to 0 by -1)
		{
			print(arr(i))
		}
		println()
	}

   def main(args: Array[String]) {
    println("How many numbers?: ")
     val a = readInt()
     val r = scala.util.Random

     for (i <- 0 until a)
     {
     	val no = r.nextInt(100)

     	printBinary(no)
     	printOctal(no)

     }
 	}
}