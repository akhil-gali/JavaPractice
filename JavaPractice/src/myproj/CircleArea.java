package myproj;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of a circle : ");
		Double radius = sc.nextDouble() ;
		Double pi = 3.14;
		System.out.println("Area of the given circle is : " +(pi*radius*radius));
		sc.close();
	}

}
