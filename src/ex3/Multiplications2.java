package ex3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Multiplications2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number and I show you its multiplication table: ");
		
		int selectedNum = sc.nextInt();
		IntStream.range(1, 11).forEach(n -> 
			System.out.println(selectedNum + " x " + n + " = " + selectedNum * n));
		
		sc.close();
	}
}
