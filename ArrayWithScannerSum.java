package basic_17_Sep;

import java.util.Scanner;

public class ArrayWithScannerSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i,j;
		//asking user to how many elements you want 
		System.out.println("Enter no of elements ");
		int num=scan.nextInt();
		//declaration of array 
		int[] array_num=new int[num];
		
		//accepting value from user
		for(i=0;i<num;i++)
		{
			System.out.print("Enter element ");
			array_num[i]=scan.nextInt();	
			
		}
		int sum=0;
		//loop for print 
		for(i=0;i<num;i++)
		{
			System.out.println(array_num[i]);
			sum=sum+array_num[i];
		}
		System.out.println("Sum of element "+sum);
		
	}

}
