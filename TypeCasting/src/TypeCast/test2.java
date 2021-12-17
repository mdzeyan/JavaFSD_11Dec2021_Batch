/**
 * 
 */
package TypeCast;

// import java.util.*;
/**
 * @author Amir Khusru
 *
 */
public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
		//String c = sc.next();
		//sc.close();
		//int i = 97;
		//char ch = (char)i;
		
		String myString = "125";
		
		
		
		int in = Integer.valueOf(myString);
		
		short sh = Short.valueOf(myString);
		
		byte by = Byte.valueOf(myString);
		
		long ln = Long.valueOf(myString);
		
		float fl = Float.valueOf(myString);
		
		double dl = Double.valueOf(myString);
		
		System.out.println("hellow world");
		System.out.println(sh);
		System.out.println(by);
		System.out.println(fl);
		System.out.println(dl);
		System.out.println(ln);
		System.out.println(in);
		
		
		

	}

}
