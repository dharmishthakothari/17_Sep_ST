package basic;

import java.util.Scanner;

public class Print_Odd_userAccept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter number 1 ");
		int i=scan.nextInt();
		System.out.println("Please enter number 2 ");
		int j=scan.nextInt();
		//i is starting number j is my ending 
		while(i<=j)
		{
			System.out.println(i);
			i=i+2;
		}
	}

}
