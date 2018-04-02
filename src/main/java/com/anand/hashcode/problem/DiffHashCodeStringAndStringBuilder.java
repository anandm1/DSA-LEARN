/**
 * 
 */
package com.anand.hashcode.problem;

/**
 * @author U45999
 *
 */
public class DiffHashCodeStringAndStringBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "ok";
		String s1 = new String("ok");
		System.out.println("HASHCODE:: "+(s.hashCode()==s1.hashCode())+" EQUALS :: "+s.equals(s1));
		StringBuilder sb = new StringBuilder("ok");
		System.out.println("HASHCODE:: "+(s.hashCode()==sb.hashCode())+" EQUALS :: "+s.equals(sb));
		StringBuilder tb = new StringBuilder("ok");
		System.out.println("HASHCODE:: "+(sb.hashCode()==tb.hashCode())+" EQUALS :: "+tb.equals(sb));
		
		Employee e1 = new Employee("Hasher");
		Employee e2 = new Employee(null);
		System.out.println(e1.hashCode()+" "+e2.hashCode());

	}

}
