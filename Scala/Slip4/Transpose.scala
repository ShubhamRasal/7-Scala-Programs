class Matrix(row:Int,col:Int){

	var arr=Array.ofDim[Int](row,col);

	def accept(){

		println("Enter Elements of array: ");

		for(i<- 0 until row){
			for(j<-0 until col){
				arr(i)(j)=scala.io.StdIn.readInt();
			}
		}
	}

	def tranpose():Matrix={

		//println("Tranpose of Given Matrix: ");
		var temp= new Matrix(row,col);

		for(i<-0 until this.row){
			for(j<-0 until this.col){
				//print(arr(j)(i)+" ")
				temp.arr(j)(i)= this.arr(i)(j)
			}
		
		}
		return temp
	}
	// 1 0 0
	// 4 5 0
	// 7 8 9
	// lower Triangular
	def chk_lowerTriangular():Boolean={

		var flag= true
		for(i<-0 until this.row if flag == true)
		{
			for(j<- i+1 until this.col)
			{
				if(this.arr(i)(j) != 0 )
				{
					flag =false
					
				}
			}
		}
	
		return flag
	}

	def display():Unit={
		for(i<- 0 until row)
		{
			for(j<-0 until col)
			{
				print(arr(i)(j)+" ")
			}
			println("\n")
		}

	}
}


object Transpose{

	def main(args:Array[String]):Unit={
		var obj= new Matrix(3,3);
		obj.accept();
		obj.display()
		var obj2=obj.tranpose();
		var flag =obj2.chk_lowerTriangular()
		println("OBJ2:")
		obj2.display()
		println("Resultant Matrix is Lower Triangular : "+flag)
	}
}