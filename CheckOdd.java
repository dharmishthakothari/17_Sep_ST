package basic;

import java.util.Scanner;

public class CheckOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i,j;		
		System.out.println("Enter start number ");
		i=scan.nextInt();
		System.out.println("Enter end number ");
		j=scan.nextInt();
		while(i<=j)
		{
			if(i%2!=0)
				{
					System.out.println(i);
				}
			i++;
		}

	}

}
