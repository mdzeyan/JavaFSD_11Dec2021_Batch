package factorial;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 1;
		
		System.out.println("Enter a Number");
		
		Scanner inpt = new Scanner(System.in);
		
		int l = inpt.nextInt();
		inpt.close();
		
		for(int i = 1; i <= l; i++)
		{
			result = result *i;
		}
		
		System.out.println("Result is: "+result);

	}

}
