package snippets;

public class Test4 {
	 public static void main(String [] args) {
	 boolean flag = !true;//false
	 System.out.println(!flag ? args[0] : args[1]);
	 }
	}

//	What will be the result of compiling and executing Test class using below commands?
//	javac Test.java
//	java Test AM PM
//	 
//	A. AM
//	B. PM
//	C. ExceptionInitalizerError while loading the .class file
//	D. CompilationError
//	args[0] = "AM"
//	args[1] = "PM"
//	System.out.println(true? "AM":"PM");

