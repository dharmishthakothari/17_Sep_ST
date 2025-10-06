package basic;

import java.util.Scanner;

public class ToCheckNumber_PosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int number=scan.nextInt();
		
			if(number>0)
			{
				System.out.println("number is Positive");
			}else if(number<0)
			{
				System.out.println("number is Negative");
			}
			else
			{
				System.out.println("Number is Zero ");
			}
			
			
	}

}
