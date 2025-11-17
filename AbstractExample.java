package basic_17_Sep;

abstract class A {
	abstract void greet();
}

class B extends A {
	void greet() {
		System.out.println("Hello");
	}
}

public class AbstractExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.greet();
	}

}
