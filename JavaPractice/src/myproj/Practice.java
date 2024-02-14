package myproj;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a your roll number: ");
		int rollNumber = sc.nextInt();
		System.out.println("Please enter a your Name: ");
		String name= sc.next();
		System.out.println("Please enter a marks in 3 subjects by giving enter after each subject : ");
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		System.out.println("Name of the student : "+name);
		System.out.println("Roll number of the student : "+rollNumber);
		int total =sub1+sub2+sub3;
		
		float average= total/3;
		System.out.println("total marks: "+total);
		System.out.println("average: "+average);
		sc.close();
	}

}
