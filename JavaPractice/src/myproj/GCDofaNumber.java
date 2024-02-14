package myproj;

import java.util.Scanner;

public class GCDofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int small;
		if (num1 < num2)
			small = num1;
		else
			small = num2;
		for (int i = small; i >= 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println("GCD is " + i);
				break;
			}
		}

		sc.close();
	}

}
