package Miscellaneous;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Check : ");
		int h = sc.nextInt();
		if (h % 2 == 0)
			System.out.println("Given Number is an Even Number");
		else
			System.out.println("Given Number is an Odd Number");

	}

}
