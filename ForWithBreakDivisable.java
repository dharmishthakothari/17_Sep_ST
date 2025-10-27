package basic;

public class ForWithBreakDivisable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break when number is divisable by 27
		for(int i=1;i<=100;i++)
		{
			if(i%22==0)
				break;
			System.out.println(i);
		}
	}
}
