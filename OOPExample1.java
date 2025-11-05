package basic_17_Sep;

class Vehical
{
	int no_of_wheels;
	String body_type;
	String engine;
	int price;
	void drive()
	{
		System.out.println("Vehical is running");
	}
}

public class OOPExample1 {

	public static void main(String[] args) {
		//object creation 'schooter'
	Vehical scooter=new Vehical();
	scooter.body_type="test";
	scooter.no_of_wheels=2;
	scooter.price=125436;
	scooter.engine="Engine1";
	System.out.println(scooter.body_type+"\t"+scooter.engine+"\t");
	scooter.drive();
	
	//object creation 'car'
	Vehical car=new Vehical();
	car.body_type="car body";
	car.price=340000;
	car.engine="engine 2";
	car.no_of_wheels=4;
	System.out.println(car.body_type+"\t"+car.price+"\t"+car.engine+"\t"+car.no_of_wheels);
	car.drive();
	
	
	}

}
