
public class Calculator {

	public static void main (String [] args) {
 numberCalc (2,4,8);
 
	}
	public static void numberCalc (double a, double b, double c) {
	
		if ((a+b)==c) {
			System.out.println(a + " + " + b + " = " + c);
			
		}
		if ((b+c)==a) {
			System.out.println(b + " + " + c + " = " + a);

		} 
		if ((c+a)==b) {
			System.out.println(a + " + " + c + " = " + b);
			
		}
		if ((a/b)==c) {
			System.out.println(a + " / " + b + " = " + c);
			
		}
		if ((b/a)==c) {
			System.out.println(b + " / " + a + " = " + c);
			
		}
		if ((a/c)==b) {
			System.out.println(a + " / " + c + " = " + b);
			
		}
		if ((c/a)==b) {
			System.out.println(c + " / " + a + " = " + b);
		}
		if ((b/c)==a) {
			System.out.println(b + " / " + c + " = " + a);
		}
		if ((c/b)==a) {
			System.out.println(c + " / " + b + " = " + a);
		}
		if ((a - b) == c) {
			System.out.println(a + " - " + b + " = " + c);
		} 
		if ((b - a) == c) {
			System.out.println(b + " - " + a + " = " + c);
		}
		if ((c - a) == b) {
			System.out.println(c + " - " + a + " = " + b);
		}
		if ((a - c) == b) {
			System.out.println(a + " - " + c + " = " + b);
		}
		if ((b - c) == a) {
			System.out.println(b + " - " + c + " = " + a);
		}
		if ((c - b) == a) {
			System.out.println(c + " - " + b + " = " + a);
		} 
		if ((a * b) == c) {
			System.out.println(a + " * " + b + " = " + c);
		}
		if ((b * c) == a) {
			System.out.println(b + " * " + c + " = " + a);
		}
		if ((c * a) == b) {
			System.out.println(c + " * " + a + " = " + b);
		}
	}
}


