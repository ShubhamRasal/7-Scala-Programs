//import java.lang.String._
//import scala.collection.immutable._

object Display_String{
	def main(args:Array[String]):Unit={

		// Accept how many elements of Array
		println("Enter Size of Array.");
		var size=scala.io.StdIn.readInt();

		// create array os String of given size
		var str_arr=new Array[String](size);

		// Accept  the elements of array
		for(i<-0 until size){
			printf("Enter %d String...\t",i+1);
			str_arr(i)=scala.io.StdIn.readLine();
		}

		// Accept Search String 
		println("Enter String which you want to search.");
		var search_str=scala.io.StdIn.readLine();

		// check given String is present or not in each String of String array
		println("Search Result :")
		for(i<-0 until str_arr.length)  // can use size variable in place of str_arr.length()
		{
			if(str_arr(i).contains(search_str))
			{
				println(str_arr(i))
			}

		}
	}
}


//Output:
/*Enter Size of Array.
5
Enter 1 String...       shubham Rasal Msc
Enter 2 String...       Gauri Raskar Msc
Enter 3 String...       Swapnil Kankure Msc
Enter 4 String...       Disha Shelake Msc
Enter 5 String...       Rushikesh Jagdale Fy
Enter String which you want to search.
Msc
Search Result :
shubham Rasal Msc
Gauri Raskar Msc
Swapnil Kankure Msc
Disha Shelake Msc
*/