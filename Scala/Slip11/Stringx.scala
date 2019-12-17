import scala.io.StdIn._
object Stringx
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

		println("Enter First String:")
		var str = readLine()

		println("Enter Substring:")
		var sub_str =readLine()

		var rpl_str = sub_str.map(convert)

		str= str.replaceAll(sub_str,rpl_str)
		println(str)
		
	}
}