package snippets;

public class Test13 {
	public static void main(String[] args) {
		int x = 10; // Line n1
		if (false)
			System.out.println(x); // Line n2
		System.out.println("HELLO"); // Line n3
	}
}
//	What is the result of compiling and executing Test class?
//	A. Compilation error at Line n1
//	B. Compilation error at Line n2
//	C. Compilation error at Line n3
//	D. HELLO
//	E. 10 
//	 HELLO
//	Answer: D(unreachable won't be checked by compiler for if and else logic)