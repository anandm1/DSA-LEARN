/**
 * 
 */
package com.anand.basic.problems;

/**
 * @author U45999
 *
 */
public class LegalTypeCastingAndCalculation {

	public static void main(String[] args) {
		int w = (int)888.8;
		byte x = (byte)100L;
		long y = (byte)100;
		byte z = (byte)100L;
		System.out.println("w="+w+"x="+x+"y="+y+"z="+z);
		double result = (98.5/6);
		System.out.println(result);
		double a,b,c;
		a=3.0/0;b=0/4.0;c=0/0.0;
		System.out.println("a="+a+"b="+b+"c="+c);
		int g=3;
		System.out.println(++g*8);
		double r=9.8,pi=3.14;
		System.out.println(pi*r*r);
		System.out.println("*****************Object Comparision with equals and == *******************");
		Integer ab = 400;
		Integer ac = 400;
		Integer ba = 40;
		Integer bc = 40;
		System.out.println(ab==ac);
		System.out.println(ba==bc);
		System.out.println(ab.equals(ac));
		System.out.println(ba.equals(bc));
		System.out.println("*****************STRING MANGO PROBLEM *******************");
		//String Comparision
		String mango = "mango";
		String mango2 = "mango";
		String mango3 = new String("mango");
		System.out.println(mango != mango2);
		System.out.println(mango == mango2);
		System.out.println(mango3 != mango2);
		System.out.println(mango3 == mango2);
		// mango2 = "mang";
		System.out.println(mango+" "+ mango2);
		System.out.println(mango.hashCode());
		System.out.println(mango2.hashCode());
		System.out.println(mango3.hashCode());

		System.out.println(System.identityHashCode(mango));
		System.out.println(System.identityHashCode(mango2));
		System.out.println(System.identityHashCode(mango3));
		
	}

}
