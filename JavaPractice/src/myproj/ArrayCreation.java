package myproj;

import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter " + size + " values");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();

		}
		System.out.println("Given Array is :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		sc.close();
	}

}
