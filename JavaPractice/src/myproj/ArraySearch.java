package myproj;

import java.util.Scanner;

public class ArraySearch {

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
		int search;
		System.out.println("enter the number that you wat to search :");
		search=sc.nextInt();
		
		if(keysearch(array,search)) {
			System.out.println("given number is present ");
		}
		else System.out.println("given number is not present in the array");
		
		sc.close();
	}
	static boolean keysearch(int[]array, int search) {
		boolean b=false;
		for(int i=0;i<array.length;i++) {
			if(array[i]==search) {
				 b=true;
				
			}
		} 
		return b;
	}

}
