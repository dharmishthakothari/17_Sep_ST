package basic;

import java.util.Scanner;

public class LogicalOpearor {
public static void main(String[] args) {
//	int number1=10,number2=100;
//	System.out.println(number1>number2);
//	System.out.println(number1>5);
//	System.out.println(number1>number2 && number1>5);
//	System.out.println(number1>number2 || number1>5);
	
	//Accept values from user 
	//Scanner class 
	Scanner scan=new Scanner(System.in);
	int number1,number2;
	System.out.println("Please enter number 1 ");
	number1=scan.nextInt();
	System.out.println("Please enter number 2 ");
	number2=scan.nextInt();
	System.out.println(number1>number2);
	System.out.println(number1>5);
	System.out.println(number1>number2 && number1>5);
	System.out.println(number1>number2 || number1>5);

	
}
}
