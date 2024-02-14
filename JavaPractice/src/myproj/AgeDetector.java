package myproj;

import java.util.Scanner;

public class AgeDetector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the age : ");
		int age = sc.nextInt();
		if (age >= 18)
			System.out.println("major");
		else if (age < 0)
			System.out.println("invalid age");
		else
			System.out.println("minor");

		sc.close();
	}

}
