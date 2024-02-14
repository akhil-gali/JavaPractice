package myproj;

import java.util.Scanner;

public class PrimenumberFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = sc.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= num) {

			if (num % i == 0) {
				sum++;
				if (sum > 2) {
					System.out.println("Given number is not a prime");
					break;
				}

			}
			i++;
		}
		if (sum <= 2)
			System.out.println("Given number is a prime");
		sc.close();
	}

}
