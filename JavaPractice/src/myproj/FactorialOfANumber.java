package myproj;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		int sum = 0;
		System.out.println("Enter the number :");
		n = sc.nextInt();
		linewriter();
		System.out.println("number     Factorial");
		linewriter();
		for (int i = 1; i <= n; i++) {
			int fact = 1;
			for (int j = 1; j <= i; j++) {
				fact = fact * j;
			}
			System.out.println("  " + i + "          " + fact);
			sum = sum + fact;
		}
		linewriter();
		System.out.println("sum   =   " + sum);
		linewriter();

		sc.close();
	}

	static void linewriter() {
		for (int i = 1; i <= 25; i++) {
			System.out.print("-");
		}
		System.out.println("-");
	}

}
