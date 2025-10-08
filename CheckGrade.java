package basic;

import java.util.Scanner;

public class CheckGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter marks ");
		marks=scan.nextInt();
		
		
		
		if(marks>=90 && marks <=100)
		{
			System.out.println("A Grade");
		}else if(marks>=70 && marks<90)
		{
			System.out.println("B Grade");
		}else if(marks>=50 && marks<70)
		{
			System.out.println("C Grade");
		}else if(marks>=45 && marks<50 )
		{
			System.out.println("D Grade");
		}else
		{
			System.out.println("Fail");
		}
			
		
		
	}

}
