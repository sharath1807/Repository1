package week1homework;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {

		// Input the number Limit 

		System.out.println("Enter the Limit for the Fibanocci series:");
		Scanner scanObject=new Scanner(System.in);
		int numberLimit=scanObject.nextInt();

		//Declare the variables
		int numberOne=0;
		int numberTwo=1;
		int numberThree=0;
		System.out.println("Fibanocci Series within "+numberLimit+" are:");
		//Using while loop to get the numbers till the limit
		while(numberThree<numberLimit)
		{
			System.out.print(numberThree);
			numberThree=numberOne+numberTwo;
			numberOne=numberTwo;
			numberTwo=numberThree;
			if(numberThree<numberLimit)
			{
				System.out.print(", ");
			}

		}
		scanObject.close();

	}

}
