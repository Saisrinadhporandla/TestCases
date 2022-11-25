package FileInput;

public class Recursion
{
	static int[] arr= {3,4,5,6};
	public static void main(String[] args) {
		
		int n=arr.length;
		//System.out.println(n);
		System.out.println(count(n-1));
		
	}
	public static int count(int n)
	{
		if(n==0)
		{
			return arr[n];
		}
		return arr[n] + count(n-1);
	}
	


}
