package snippets;

public class Test9 {
	 public static void main(String[] args) {
	 String msg = "Hello";
	 boolean [] flag = new boolean[1];
	 if(flag[0]) {
	 msg = "Welcome";
	 }
	 System.out.println(msg);
	 }
	}
//	A. Hello
//	B. Welcome
//	C. ArrayIndexOutOfBoundsException
//	D. NullPointerException
//	E. CompileTimeError
//	Answer: A
