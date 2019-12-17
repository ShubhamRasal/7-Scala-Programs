import scala.io.StdIn._

abstract class Employee{
	def computeSal():Float;
}

class Worker(name:String) extends Employee
{
	var hours=0
	var rate=0.0f
	var salary=0.0f

	def computeSal():Float={
		println("Enter Number of Hours:")
		hours= readInt()
		println("Enter Rate per Hour:")
		rate = readInt()
		salary =hours*rate
		return salary
	}

	def display():Unit={

		println("Name:"+name)
		println("Designation:Wroker")
		println("No of Hrs:"+hours)
		println("Rate per Hours:"+rate)
		println("Salary:"+salary)
		println("----------------------------------------------------")
	}
} 

class Manager(name:String)
{
	var basic_sal = 0.0f
	var incentive = 0.0f
	var salary=0.0f
	def computeSal():Float={
		println("Enter Monthly Salary:")
		basic_sal= readFloat()
		println("Enter additional incentive:")
		incentive = readFloat()
		salary = basic_sal + incentive
		return salary
	}

	def display():Unit={

		println("Name:"+name)
		println("Designation:Manager")
		println("Basic Salary:"+basic_sal)
		println("additional incentive:"+incentive)
		println("Salary:"+salary)
		println("----------------------------------------------------")
	}
}

object UseEmployee
{
	def main(args:Array[String]):Unit={
		
		//create object of Wroker
		var worker_arr= new Array[Worker](5)

		for(i<-0 until 5)
		{
			println("Enter Name of Wroker "+(i+1)+":")
			var name= readLine()
			worker_arr(i)= new Worker(name)
			worker_arr(i).computeSal() 
			worker_arr(i).display
		}
		//create object of Manager
		var manager_arr= new Array[Manager](5)

		for(i<-0 until 5)
		{
			println("Enter Name of Manager "+(i+1)+":")
			var name= readLine()
			manager_arr(i)= new Manager(name)
			manager_arr(i).computeSal()
			manager_arr(i).display 
		}


	}
}