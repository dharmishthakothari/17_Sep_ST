package basic_17_Sep;

class Shape
{
	float calculateArea()
	{
		return 0.0f;
	}
}
class Rectangle extends Shape
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
class Square extends Shape
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
public class Poly_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape objShape=new Shape();
		float ans1=objShape.calculateArea();
		System.out.println("Area of Shape "+ans1);
		
		
		Rectangle objRect=new Rectangle();
		objRect.setData(2, 3);
		float ans=objRect.calculateArea();
		System.out.println("Area of Rectangle "+ans);
	
		Square objSquare=new Square();
		objSquare.setData(4);
		float ans2=objSquare.calculateArea();
		System.out.println("Area of Square "+ans2);
	
	}

}
