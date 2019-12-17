
object EMP{
	def print(EMP:Map[String,String]):Unit=
	{
		println("Employee name \t Department Name")
     	for ((k,v) <- EMP)
     	{
     		println(k+" \t "+ v)

     	}
	} 

   def main(args: Array[String]):Unit= {
      val EMP=Map("Mr.Joshi"->"CS","Mr.Rasal"->"CS","Mr.Kankure"->"COM","Mrs.Raskar"->"CS","Mr.Sawant"->"CS","Mr.Misal"->"SCI","Mr.Pawar"->"ART")
     
     // print Map
     print(EMP)

     println("----------------")

     val value=EMP("Mr.Joshi")
     	println("Employee who works with Mr.Joshi:")
     	println("Employee name \t Department Name")
     	for ((k,v) <- EMP)
     	{
     		if(v == value)
     			println(k+" \t "+ v)

     	}

     }
}