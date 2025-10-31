package basic_17_Sep;

public class Sum_Array_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {23,56,86};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of elements "+sum);
	}

}
