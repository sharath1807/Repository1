package week1homework;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {


		//Input any number

		System.out.println("Enter any Number: ");
		Scanner scanObject=new Scanner(System.in);
		int number=scanObject.nextInt();
		int factorial=1;
		System.out.println("Factorial of "+number+" is: ");

		// using for loop to find the factorial

		for(int i=number;i>0;i--)
		{
			factorial=factorial*i;
			System.out.print(number);
			number--;
			//using if condition to print * and = based on the number value
			if(number>0)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print("=");
			}
		}
		System.out.print(factorial);
		scanObject.close();
	}

}
