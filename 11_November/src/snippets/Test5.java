package snippets;

public class Test5 {
	 public static void main(String [] args) {
	 int a = 3;// a = 4
	 System.out.println(a++ == 3 || --a == 3 && --a == 3);//true
	System.out.println(a);//4
	 }
	}
//
//A. true
//3
//B. false
//3
//C. True
//3
//D. False
//3
//E. true
//4 
//F. false
//3
//G. CompilationError
