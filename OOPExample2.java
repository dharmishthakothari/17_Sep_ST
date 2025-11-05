package basic_17_Sep;

import java.util.Scanner;

class Person
{
	int c_no;
	String name;
	void getDetails()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter contact no ");
		c_no=scan.nextInt();
		System.out.println("Enter name ");
		name=scan.next();
	}
	void display()
	{
		System.out.println(name+"\t"+c_no);
	}
}
public class OOPExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ritesh=new Person();
		ritesh.getDetails();
		
		Person mayur=new Person();
		mayur.getDetails();
		
		ritesh.display();

		ritesh.display();
	}

}
