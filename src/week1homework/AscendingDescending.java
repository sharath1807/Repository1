package week1homework;
import java.util.Scanner;

public class AscendingDescending {

	public static void main(String[] args) {

		Scanner objectArray=new Scanner(System.in);
		System.out.println("Entered the size of the array");
		int sizeofArray=objectArray.nextInt();
		int arrayOne[]=new int[sizeofArray];
		int k=0;

		for(int i=0;i<sizeofArray;i++)
		{
			arrayOne[i]=objectArray.nextInt();
		}
		System.out.println("Ascending Order is: ");
		for(int i=0;i<sizeofArray-1;i++)
		{
			//System.out.print(arrayOne[i]+" ");
			for(int j=0;j<sizeofArray-1;j++)
			{
				if(arrayOne[j]>arrayOne[j+1])
				{
					int temp=0;
					temp=arrayOne[j];
					arrayOne[j]=arrayOne[j+1];
					arrayOne[j+1]=temp;
				}

			}

		}
		for(k=0;k<sizeofArray;k++)
		{
			System.out.print(arrayOne[k]+"\t");
		}

		// Descending Order

		System.out.println("\nDescending Order is: ");
		for(int i=0;i<sizeofArray-1;i++)
		{
			//System.out.print(arrayOne[i]+" ");
			for(int j=0;j<sizeofArray-1;j++)
			{
				if(arrayOne[j]<arrayOne[j+1])
				{
					int temp=0;
					temp=arrayOne[j];
					arrayOne[j]=arrayOne[j+1];
					arrayOne[j+1]=temp;
				}

			}

		}
		for(k=0;k<sizeofArray;k++)
		{
			System.out.print(arrayOne[k]+"\t");
		}

		System.out.println("\nFirst Largest Number is: "+arrayOne[0]+"\t"+"\nThird Largest Number is: "+arrayOne[2]);
	objectArray.close();
	}

}
