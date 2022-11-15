package snippets;

public class Test6 {
	 public static void main(String [] args) {
	 int a = 3;
	 m(++a, a++);
	 System.out.println(a);
	 }
	 private static void m(int i, int j) {
	 i++;
	 j--;
	 }
	}
//	A. 4
//	B. 5
//	C. 6
//	D. 3
