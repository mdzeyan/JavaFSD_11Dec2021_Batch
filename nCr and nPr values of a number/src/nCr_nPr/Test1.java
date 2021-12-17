package nCr_nPr;

import java.util.*;





public class Test1 {
	
	
	
	public static int fact(int n)
	{
		int result = 1;

		for(int i = 1; i <= n; i++)
		{
			result = result *i;
		}
		
		return result;
	
	}
	
	public static double permutation(int n, int r)
	{
		double f = fact(n)/fact(n-r);
		return f;
	}
	
	public static double combination(int n, int r)
	{
		double f = fact(n)/(fact(n-r)*fact(r));
		return f;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the value of n & r");

		Scanner inpt = new Scanner(System.in);
		int n = inpt.nextInt();
		int r = inpt.nextInt();
		inpt.close();
		
		double x = permutation(n,r);
		double y = combination(n,r);
		
		System.out.println("Permutation is: "+x);
		System.out.println("Combination is: "+y);

	}

}
