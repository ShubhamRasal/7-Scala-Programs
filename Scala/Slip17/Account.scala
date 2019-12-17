import scala.io.StdIn._


class SavingAccount(accNo:Int,name:String)
{
	var minBal =0.0f
	var total_balance = 0.0f
	def this(accNo:Int,name:String,balance:Float,minBal:Float=500.0f)
	{
		this(accNo,name)
		this.minBal=minBal
		this.total_balance = balance
	}
	def withdraw():Unit={
		println("Enter Amount to withdraw:")
		val amt= readFloat()

		if(amt <= (this.total_balance-minBal))
		{
			this.total_balance-= amt
			println("Transaction Completed Successfully.")
		}else
		{
			println("Oopps...Insufficient balance.")
		}
	}//withdraw

	def deposit():Unit={
		println("Enter Amount to deposit:")
		val amt= readFloat()

		this.total_balance= this.total_balance + amt
		println("Transaction Completed Successfully."+total_balance)
	}//deposit

	def viewBalance():Unit={
		println("Total Balance :"+this.total_balance)
		println("Minimum Balance:"+this.minBal)
		println("-------------------------------------------")
	}
}

object Account
{
	def main(args:Array[String]):Unit={
		println("How many Accounts?")
		var size= readInt()

		var arr = new Array[SavingAccount](size)

		for(i<-0 until size)
		{
			println("Enter Account NO:Int")
			var ac= readInt()
			println("Enter Account Holder Name:")
			var name=readLine()
			println("Minimum balance:(enter 0 to set default)")
			var minbal = readFloat()
			println("Enter Account Balance:")
			var total= readFloat()

			if(minbal != 0)
			{
				arr(i) = new SavingAccount(ac,name,total,minbal)
			}
			else
			{
				arr(i)= new SavingAccount(ac,name,total)	
			}
			arr(i).viewBalance
			arr(i).deposit
			arr(i).withdraw
			arr(i).viewBalance
			
		}
	}
}