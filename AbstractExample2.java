package basic_17_Sep;

abstract class Shape1
{
	abstract float calculateArea();
	
}
class Rectangle1 extends Shape1
{
	int l,b;
	
	void setData(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	@Override
	float calculateArea() {
		// TODO Auto-generated method stub
		//return super.calculateArea();
		float area;
		area=l*b;
		return area;
	}		
}
class Square1 extends Shape1
{
	int side;
	void setData(int side)
	{
		this.side=side;
	}
	float calculateArea()
	{
		return 2*side;
	}
	
	
}
public class AbstractExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape1 objShape=new Shape1();
//		float ans1=objShape.calculateArea();
//		System.out.println("Area of Shape "+ans1);
//		
		
		Rectangle1 objRect=new Rectangle1();
		objRect.setData(2, 3);
		float ans=objRect.calculateArea();
		System.out.println("Area of Rectangle "+ans);
	
		Square1 objSquare=new Square1();
		objSquare.setData(4);
		float ans2=objSquare.calculateArea();
		System.out.println("Area of Square "+ans2);
	
	}

}
