import scala.io.StdIn._

object PrimeRange{

	def avgPimeRange(n1:Int,n2:Int):Int={
		var cnt=0;
		var wflag=true
		var sum=0
		var i:Int=0
		for(i <- n1 to n2 if i != 1)
		{
				for(j<-2 to ((i/2)+1))
				{
					if(i%j == 0)
						wflag =false
				}
			
			if ((wflag == true)||(i == 2))
			{
				println("Prime: "+ i)
				sum=sum+i
				cnt+=1
			}
			wflag=true
		}
		return sum/cnt
	}

	def main(args:Array[String]):Unit={
		print("Hello world")

		println("Enter Range: ")
		var r1= readInt()
		val r2= readInt()
		var ret=0
		

		 ret=avgPimeRange(r1,r2)
		
		println("Average is :"+ret)


	}
} 