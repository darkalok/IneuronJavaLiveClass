package snippets;

public class Test7 {
	 public static void main(String [] args) {
	 boolean flag = false;//true, false
	 System.out.println((flag = true) | (flag = false) || (flag = true));// 
	//true |false => true || (flag=true)
	 System.out.println(flag);//false
	 }
	}
//	What is the result of compiling and executing Test class?
//	A. true
//	 false
//	B. false
//	 true
//	C. true
//	 true
//	D. false
//	 false
//	E. CompilationError
//	Answer: A
