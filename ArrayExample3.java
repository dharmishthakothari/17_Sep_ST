//To find number is even or odd from an array
package basic;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]= {203,5464,560,303,899,203,1002};
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]%2==0)
				System.out.println(numbers[i]+" is even");
			else
				System.out.println(numbers[i]+" is odd");
		}
		
	}

}
