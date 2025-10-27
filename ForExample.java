package basic;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print 1-10
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		//print 10-1
		for(int i=10;i>=1;i--)
		{
			if(i%2==0)
				System.out.println(i+" Even");
			else
				System.out.println(i+" Odd");
		}
		
		
	}

}
