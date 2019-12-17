
object Stringx{
	def main(args:Array[String]):Unit={
		println("Helllo world")

		println("Enter String:")
		var str= scala.io.StdIn.readLine()

		println("Enter Character that you want to remove: ")
		var ch=scala.io.StdIn.readChar()

		
		var sb = new StringBuilder(str)

		// find first occurence and last occurence
		var first =sb.indexOf(ch)
		var last = sb.lastIndexOf(ch)

		sb.deleteCharAt(first)
		sb.deleteCharAt(last-1)

		var result= sb.toString()
        println("After Removing First and Last Ouccrence : Result:"+result)

        //clear StringBuilder
        sb.clear()

        // reverse its case 
        for(c<- result)
        {
            if(c.isUpper)
            {
                sb.append(c.toLower)
            }
            else
            {
                sb.append(c.toUpper)
            }
        }
     	result= sb.toString()
        println("Resultant String:"+result)



	}//main
}