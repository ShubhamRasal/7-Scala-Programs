
abstract class Order(idx:Int,des:String)
{
	var id:Int=idx;
	var description:String=des;
	def displayDetails():Unit;
}

class PurchaseOrder(idx:Int,des:String,amt:Float,supplier:String) extends Order(idx,des)
{

	def displayDetails():Unit={
		println("----- Purchase Order Details ----")
		println("ID:"+id);
		println("Description:"+description);
		println("Vendor:"+supplier);
		println("Amount:"+amt);
	}
}

class SalesOrder(idx:Int,des:String,cust:String) extends Order(idx,des)
{

	def displayDetails():Unit={
		println("----- Sales Order Details ----")
		println("ID:"+id);
		println("Description:"+description);
		println("Customer"+cust);
	}
}



object UseOrder{

	def main(args:Array[String]):Unit={
		
		var PO_obj=new PurchaseOrder(1,"Mobile",10000.0f,"Galaxy Mobile Store");
		PO_obj.displayDetails();
		var SO_obj=new SalesOrder(1,"Mobile","Shubham Dharma Rasal");
		SO_obj.displayDetails();
	}
}