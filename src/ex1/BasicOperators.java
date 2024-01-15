package ex1;

import java.util.Scanner;

public class BasicOperators {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter the first nuber: ");
	    double n1 = Double.parseDouble(myObj.nextLine());  // Read user input
	    System.out.print("Enter the second nuber: ");
	    double n2 = Double.parseDouble(myObj.nextLine());  // Read user input
	    myObj.close(); // Closes the Scanner object

	    
		char[] operators = {'+','-','/','*', '%'};
		
		for (char operator : operators) {
			
			double result = 0.0;
			String operation = "";
			
			switch (operator) {
			case '+': 
				result = n1 + n2;
				operation = "addition";
				break;
			case '-':
				result = n1 - n2;
				operation  = "subtraction";
				break;
			case '/':
				result = n1 / n2;
				operation = "division";
				break;
			case '%':
				result  = n1 % n2;
				operation =  "modulus";
				break;
			case '*':
				result  = n1 * n2;
				operation =  "multiplication";
				break;
			}
			
			System.out.println("The " + operation  + " between " + n1 + " and " +  n2  + " is equal to " + result);
		}
		
	}
}
