package ex1;

public class BasicOperators {
	public static void main(String[] args) {
		int n1 = 2;
		int n2 = 5;
		
		System.out.println("The ADDITION between " + n1 + " and "  + n2 + 
				" is equal to: " + (n1+n2));
		System.out.println("The SUBTRACITON between " + n1 + " and "  + n2 + 
				" is equal to: " + (n1-n2));
		System.out.println("The MULTIPLICATION between " + n1 + " and "  + n2 + 
				" is equal to: " + (n1*n2));
		System.out.println("The DIIVSION between " + n1 + " and "  + n2 + 
				" is equal to: " + (Double.valueOf(n1)/n2));
		System.out.println("The MODULO between " + n1 + " and "  + n2 + 
				" is equal to: " + (n1%n2));
	}
}
