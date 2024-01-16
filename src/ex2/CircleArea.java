package ex2;
import java.util.Scanner;

public class CircleArea {
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle: ");
		double radius = myScanner.nextDouble();
		
		double area = Math.PI * (Math.pow(radius, 2));
		
		System.out.println("The circle area is: " + area);
		
		myScanner.close();
	}
}
