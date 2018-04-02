package com.anand.basic.problems;

public class CheckEquals {

	public static void main(String[] args) {
		Employee e1 = new Employee("hi");
		Employee e2 = new Employee("hi");
		double divideby=0.0d;double todivide=0.0d;
		double x = todivide/divideby;
		System.out.println((x==Double.NaN));
		System.out.println((Double.isNaN(x)));
		System.out.println(2.0 - 1.1);
		
		
		
		System.out.println("\u2122");
		System.out.println("\u03C0");
		
		System.out.println(e1.hashCode());
		System.out.println(e1.hashCode());
		//If equals is not overriden then it checks equals of object 
		// class which in turn uses == , that in turn compare reference (i.e. they refer to the same object) not values.
		//while equals , if (name.equals("Mickey Mouse"))  // Compares values, not references.
		//Because the equals() method makes a == test first, 
		//it can be fairly fast when the objects are identical. It only compares the values if the two references are not identical.
		// Horstmann's Core Java Vol 1.
		System.out.println(e1.equals(e2));

	}

}

class Employee implements Cloneable{

	  private String name;

	  Employee(String name){
	    this.name = name;
	  }

	  /*@Override
	  public boolean equals(Object obj) {           
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Employee other = (Employee) obj;
	        if (name == null) {
	            if (other.name != null)
	                return false;
	        } else if (!name.equals(other.name))
	            return false;
	        return true;
	    }*/

	}
