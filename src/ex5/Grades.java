package ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many grades do you have?: ");
		int nGrades = sc.nextInt();
		int i = 0;
		List<Double> gradeList = new ArrayList<>();
		
		do {
			System.out.println("Introduce grade " + (i+1) + " : " );
			gradeList.add(sc.nextDouble());
			i++;
			
		} while (i < nGrades);
		
		sc.close();
		
		double sum = gradeList.stream().reduce(0.0, Double::sum);
		double average = sum  / nGrades;
		System.out.println("The average is " + average);
		
		switch ((int) average) {
		case 10: {
			System.out.println("Excellent!");
			break;	
		}
		case 9: {
			System.out.println("Almost excellent!");
			break;	
		}
		case 8: {
			System.out.println("Great job, continue like this.");
			break;	
		}
		case 7:
		case 6:{
			System.out.println("Good.");

		}
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0: {
			System.out.println("Failed! Try to improve your grades.");
		}
		default:
			System.err.println("Something went wrong. Check your grades and retry.");
		}
		
		
	}
}
