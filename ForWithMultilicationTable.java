package basic;

import java.util.Scanner;

public class ForWithMultilicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number ");
		int num=scan.nextInt();
		int mul;
		for(int i=1;i<=10;i++)
		{
			
			mul=num*i;
			System.out.println(num+" * "+i+" = "+mul);
		}		
	}

}
