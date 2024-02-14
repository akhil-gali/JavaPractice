package myproj;

import java.util.Scanner;

public class ArrayAddition {

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
		
		int sum = 0;
		for (int x : array) {
			sum = sum + x;
		}
		System.out.println("sum of elements in gven Array is :"+sum);
		sc.close();
	}

}
