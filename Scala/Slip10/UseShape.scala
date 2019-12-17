abstract class Shape()
{
	def volume():Float;
	def display():Unit;
}

class Cube(a:Float) extends Shape
{

	def volume():Float={
		return a*a*a
	}
	def display():Unit=
	{
		println("Cube:")
		println("Length of Edge:"+this.a)
		println("Volume:"+this.volume)
		println("------------------------------------------------------")
	}

}

class Cylinder(r:Float,h:Float) extends Shape
{
	def volume():Float={
		return 3.14f*r*r*h
	}
	def display():Unit=
	{
		println("Cylinder:")
		println("Radius:"+this.r)
		println("Height:"+this.h)
		println("Volume:"+this.volume)
		println("------------------------------------------------------")
	}
}


object UseShape
{
	def main(args:Array[String]):Unit=
	{
		var cube_obj = new Cube(3.0f)
		cube_obj.display

		var cyl_obj = new Cylinder(3.0f,5.0f)
		cyl_obj.display()
	}
}