package snippets;

public class Test10 {
	 public static void main(String [] args) {
	 boolean flag1 = true;
	 boolean flag2 = false;
	 boolean flag3 = true;
	 boolean flag4 = false;
	 System.out.println(!flag1 == flag2 != flag3 == !flag4); //Line n1
	 System.out.println(flag1 = flag2 != flag3 == !flag4); //Line n2
	 }
	}

//	What will be the result of compiling and executing Test class?
//	A. Line n1 cause compilation error
//	B. Line n2 causes compilatione error
//	C. true
//	 true
//	D. true
//	 false
//	E. false
//	 true
//	F. false
//	 false
//	JVM
//	===
//	 !true == false != true == !false
//	 false== false != true == !false
//	 true != true == !false
//	false == true
//	false
//	 flag1 = false!= true == !false
//	 flag1 = true == true
//	 flag1 = true
//	 true
//	Answer: E
//
