package basic_17_Sep;
class Person2
{
	int age;
	String name;
	void setDetails(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println(name+"\t"+age);
	}
}
class Employee extends Person2
{
	int eid,salary;
	String email;
	void setDetails(int eid,String name,int age,String email)
	{
		
		super.setDetails(name, age);
		
		this.eid=eid;
		this.email=email;	
	}
	void display()
	{
		//super.display();
		System.out.println(eid+"\t"+name+"\t"+age+"\t"+email);
	}
}



public class Poly_Overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setDetails(12,"test",23,"e@e.com");
		e1.display();
		
	}

}
