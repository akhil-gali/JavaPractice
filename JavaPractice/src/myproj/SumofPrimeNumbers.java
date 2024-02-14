package myproj;

import java.util.Scanner;

public class SumofPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 2; i <= num; i++) {
			int k = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					k++;
					if (k > 2) {
						break;
					}
				}
			}
			if (k <= 2)
				sum = sum + i;

		}
		System.out.println("Sum of prime numbers are : " + sum);
		sc.close();
	}

}
