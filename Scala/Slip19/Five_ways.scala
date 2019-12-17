// create Lst using five different methods(List style,java style,fill,range,tabulate methods)

//usinf Lisp style
//List using the “cons” syntax, like this:
var list_1= 11::22::33::44::55::Nil
println("var list_1= 11::22::33::44::55::Nil")
println("Using Lisp Style :"+list_1)
//In this “cons” style, the :: method takes two arguments,
// a “head,” which is a single element, and a “tail,” which is a List. (And yes, :: is a function/method.)

// using Java Style
var list_2= List(11,22,33,44,55)
println("var list_2= List(11,22,33,44,55)")
println("Using Java Style :"+list_2)

//using Fill method
var list_3= List.fill(3)("Shubham Rasal")
println("var list_3= List.fill(3)")
println("Using Fill method: "+list_3)

//using range method
var list_4= List.range(1,10)
println("var list_4= List.range(1,10)")
println("Using Range method:  "+list_4)

//using tabulate method
//The tabulate method creates a new List whose elements are created according to the function you supply. 
var list_5= List.tabulate(5)(n => n*n)
println("var list_5= List.tabulate(5)(n => n*n)")
println("Using tabulate method: "+list_5)