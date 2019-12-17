
object Student{
	def print(Stud:Map[String,Float]):Unit=
	{
		println("Student name \t Percentage")
     	for ((k,v) <- Stud)
     	{
     		println(k+" \t "+ v)

     	}
	} 

   def main(args: Array[String]):Unit= {
      val Student=Map("Shubham"->99.99f,"Swapnil"->99.90f,"Gauri"->95.00f)
     
     // print Map
     print(Student)     //userdefined function

     println("----------------")

     var max=0.0f
     var stud_name:String="";
     	for ((k,v) <- Student)
     	{
     		if(v > max)
     		{
                max=v;
                stud_name = k
            }

     	}

        println("Topper:"+stud_name+"\t"+max)

     }
}