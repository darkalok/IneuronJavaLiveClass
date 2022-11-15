package snippets;

public class Test2 {
	public static void main(String[] args) {
		String fruit = new String(new char[] { 'M', 'a', 'n', 'g', 'o' });
		switch (fruit) {
		default:
			System.out.println("ANY FRUIT WILL DO");
		case "Apple":
			System.out.println("APPLE");
		case "Mango":
			System.out.println("MANGO");
		case "Banana":
			System.out.println("BANANA");
			break;
		}
	}
}
//	A. ANY FRUIT WILL DO
//	B. MANGO
//	C. MANGO
//	 BANANA
//	D. ANY FRUIT WILL DO
//	 APPLE
//	 MANGO
//	 BANANA
