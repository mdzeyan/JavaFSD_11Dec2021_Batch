package increment_decrement;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5, c;
		int b = 5, d;
		
// ********* pre-increment **********
		
		c = ++a;
		
		System.out.println("printing value of c pre-increment  "+c);
		System.out.println("printing value of a pre-increment  "+a);
		
		
// ********** post increment **********
		
		d = b++;
		
		System.out.println("printing value of d post-increment  "+d);
		System.out.println("printing value of b post-increment  "+b);
		
		int x = 1;
		int y = 1;
// *********** pre-increment & post-increment *************
		
		System.out.println(++x);
		


		System.out.println(y++); 

		
		
		

	}

}
