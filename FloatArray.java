package basic_17_Sep;

import java.util.Scanner;

public class FloatArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num;
		System.out.println("Enter no of elements ");
		num=scan.nextInt();
		
		float[] arr=new float[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter element ");
			arr[i]=scan.nextFloat();
		}
		for(int i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
