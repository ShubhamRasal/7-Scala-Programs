import scala.io.StdIn._
object InvertCase
{
	def convert(ch:Char):Char={
		if(ch.isUpper)
		{
			 return ch.toLower
		}
		else
			return ch.toUpper
	}
	def main(args:Array[String]):Unit={
		println("Hello World")

		println("Enter  String:")
		var str = readLine() 

		var new_str = str.map(convert)
		println(new_str)
		
	}
}