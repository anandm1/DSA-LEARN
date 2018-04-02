/**
 * 
 */
package com.anand.hashcode.problem;

import java.util.Objects;

/**
 * @author U45999
 *
 */
public class Employee {
	private String name;
	
	private Employee(){
		throw new AssertionError("No java.util.Objects instances for you!");
	}
	
	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		//System.out.println(this.name.hashCode());
		return (10*Objects.hashCode(this.name));
	}
	
	
}
