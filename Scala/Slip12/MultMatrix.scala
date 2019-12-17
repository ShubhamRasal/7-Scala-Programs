class Matrixx(row:Int,col:Int){

	var arr=Array.ofDim[Int](row,col);
	var rows=row;
	var cols=col;
	def accept(){

		println("Enter Elements of Matrix: ");

		for(i<- 0 until rows){
			for(j<-0 until cols){
				arr(i)(j)=scala.io.StdIn.readInt();
			}
		}
	}
	def show(){

		println(" Given Matrix: ");


		for(i<- 0 until row){
			for(j<-0 until col){
				print(arr(i)(j)+" ")
			}
			println("");
		}
	}

		def calculateDet(p:Int):Int={

		var temp= Array.ofDim[Int](2,2);
		var k:Int=0;
		var l:Int=0;
		for(i<-1 until row){
			for(j<-0 until col){
				if(j !=p ){
					temp(k)(l)=arr(i)(j);
					l+=1;
				}
				
			}//col loop
			k+=1;
			l=0;
		}
		var ret=(temp(0)(0)*temp(1)(1))-(temp(0)(1)*temp(1)(0));
		//println("calculateDet is: "+ret);
		return ret;
	}

	def getDeterminant(){
		//if(row == col == 2){
			//return(arr(0)(0)*arr(1)(1))-(arr(0)(1)*arr(1)(0));
		//}

		var ret=0;
		var sign=1;

		for(i<-0 until row){

			//println("sign is:"+sign);
			ret=ret+ sign * arr(0)(i)*calculateDet(i); 
			println("Ret is :"+ret);
			sign = -sign;
		}

		println("Determinant :"+ ret);
	}

}

object MatrixMultiply{
	
	def MultMat(mat1:Matrixx,mat2:Matrixx):Matrixx={

		if(mat1.cols != mat2.rows){
			var set=""""cannot be multiplied together because the number of columns in one matrix  
			does not equal to the number of rows in another matrix"""
			println(set);
			}
		var answer=new Matrixx(mat1.rows,mat2.cols);
		var m=0;var n=0;
		var temp=0;
			
			for(i<-0 until answer.rows)
			{
				for(j<-0 until answer.cols){

					for(k<-0 until mat2.rows){
						temp=temp+mat1.arr(i)(k)*mat2.arr(k)(j);
					}
					answer.arr(i)(j)=temp;
					temp=0;
				}
			}
		return answer;

	}

	def main(args:Array[String]):Unit={
		var obj= new Matrixx(3,3);
		obj.accept();
		var obj2= new Matrixx(3,3);
		obj2.accept();

		var ans=MultMat(obj,obj2);
		ans.show();

		println("Determinant of resultant Mtrix is :")
		ans.getDeterminant()
	}

}