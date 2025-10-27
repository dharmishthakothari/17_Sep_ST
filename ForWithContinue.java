package basic;

public class ForWithContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i==5 || i==7)
			{
				//break;
				continue;
			}			
			System.out.println(i);			
		}
	}

}
