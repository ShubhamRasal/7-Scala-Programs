import scala.io.StdIn._
import scala.util._

class Matrixx(row:Int,col:Int)
{
	var rows=row
	var cols=col
	var mat = Array.ofDim[Int](rows,cols)

	def accept():Unit={
		println("Enter Elements:")
		for(i<-0 until rows)
		{
			for(j<-0 until cols)
			{
				mat(i)(j)= readInt()
			}
		}
	}

	def mutliply(mobj:Matrixx):Matrixx=
	{
		if (this.cols != mobj.rows)
		{
			var set=""""cannot be multiplied together because the number of columns in one matrix  
			does not equal the number of rows in another matrix"""
			println(set);
			return null
		}

		var ans = new Matrixx(this.rows,mobj.cols)

		for(i<-0 until ans.rows)
		{
			for(j<-0 until ans.cols)
			{
				for(k<-0 until this.cols)
				{
					ans.mat(i)(j)+=this.mat(i)(k)*mobj.mat(k)(j)
				}
			}
		}

		return ans;
	}//mutliply

	def display():Unit={
		for(i<-0 until this.rows)
		{
			for(j<-0 until this.cols)
			{
				print(this.mat(i)(j)+" ")
			}
			println(" ")
		}
	}

	def chk_upperTriangular():Boolean=
	{
		var flag=true

		for(i<-0 until this.rows if flag == true )
		{
			for(j<-0 until i )
			{
				if (mat(i)(j)!=0)
					flag= false
			}
		}
		return flag;
	}

}


object MultMat{



	def main(args:Array[String]):Unit=
	{
		println("Enter Dimensions of MAtrix 1:")
		var rows1= readInt()
		var cols1= readInt()

		//create objects of matrixx class
		var mobj1= new Matrixx(rows1,cols1)
		
		//accept matrix from user
		mobj1.accept()
		
		println("Enter Dimensions of MAtrix 2:")
		var rows2 = readInt()
		var cols2 =readInt()

		var mobj2 = new Matrixx(rows2,cols2)
		mobj2.accept()

		var ans = mobj1.mutliply(mobj2)
		if(ans!=null)
		{
			ans.display()
			// check our multiplcation answer is upper Triangular or not
			if(ans.chk_upperTriangular())
			{
				println("Resultant Matrix is Upper Triangular.")
			}
			else 
			println("Resultant Matrix is not Upper Triangular.")
		}

	}
}