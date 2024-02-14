package myproj;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 3 numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int result = (num1 > num2 && num1 > num3) ? num1
				: ((num2 > num1 && num2 > num3) ? num2 : ((num3 > num1 && num3 > num2) ? num3 : 0));

		System.out.println("largest number is : " + result);
		sc.close();
	}

}
