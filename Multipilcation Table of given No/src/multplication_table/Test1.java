package multplication_table;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inpt = new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int N = inpt.nextInt();
		inpt.close();
		
		for(int i = 1; i <= 10; i++)
		{
			int rslt = N*i;
			System.out.println(N+" X "+i+" = "+rslt);
			
		}

	}

}
