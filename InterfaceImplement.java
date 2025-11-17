package basic_17_Sep;

public class InterfaceImplement implements MathInterface {
	public int addition(int n,int n2)
	{
		return n+n2;
	}
	public int substraction(int n,int n2)
	{
		return n-n2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplement obj=new InterfaceImplement();
		System.out.println(obj.addition(2123, 11));
	}

}
