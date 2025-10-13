package basic;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age,weight;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Age ");
		age=scan.nextInt();
		
		System.out.println("Enter Weight ");
		weight=scan.nextInt();
		
		if(age>=18)
		{
			if(weight>=45)
			{
				System.out.println("User is eligible to donate blood ");
			}
			else
			{
				System.out.println("Due to under weight user is not able to donate blood");
			}
		}else
		{
			System.out.println("User is not Adult so could not able to donate blood");
		}
		

	}

}
