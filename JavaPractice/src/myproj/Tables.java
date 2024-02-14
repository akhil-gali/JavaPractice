package myproj;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the number of tables you want :");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " X" + j + " =" + (i * j));
			}
			FactorialOfANumber.linewriter();
		}

		sc.close();
	}

}
