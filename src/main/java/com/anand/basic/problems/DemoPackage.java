/**
 * 
 */
package com.anand.basic.problems;

import java.net.URL;
import java.util.Set;
import java.util.jar.Manifest;

/**
 * @author U45999
 *
 */
public class DemoPackage {

	/*
	 * @param args
	 */
	public static void main(String[] args) {
		Manifest man = null;
		URL url = null;
		//Package pack = new Package("name", man, url, null);
		
		EmployeeDetails empObj = new EmployeeDetails(12,"A.Prakash", new int[]{1,2});
		EmployeeDetails empObj2 = empObj;
		System.out.println(empObj2 == empObj);
		System.out.println(empObj.equals(empObj2));
		
		Set<Object> props = System.getProperties().keySet();
		for(Object o : props){
			System.out.print(o.toString());
			System.out.print(" :: " + System.getProperty(o.toString()));
			System.out.println();
		}
		
		System.out.println(empObj.clone());
		EmployeeDetails empCloneObj = (EmployeeDetails) empObj.clone();
		System.out.println(empCloneObj != empObj);
		System.out.println(empCloneObj == empObj);
		System.out.println(empObj.getClass() == empCloneObj.getClass());
		System.out.println(empObj.equals(empCloneObj));
		System.out.println(empCloneObj.getName()+" :: "+empCloneObj.getDno().length	);
	}
}	

class EmployeeDetails implements Cloneable{
	private int empId;
	private String name;
	private int[] dno;
	public EmployeeDetails(){
		super();
	}
	
	/**
	 * @param empId
	 * @param name
	 */
	public EmployeeDetails(int empId, String name,int[] dno) {
		this.empId = empId;
		this.name = name;
		this.dno = dno;
	}
	
	/**
	 * @return the dno
	 */
	public int[] getDno() {
		return dno;
	}

	/**
	 * @param dno the dno to set
	 */
	public void setDno(int[] dno) {
		this.dno = dno;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	protected Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.empId;
		
	}
}

