package com.anand.basic.inheritance;

class A {
	A(){
		System.out.println("In Class A Constructor");
	}
	void display(){
		System.out.println("In Class A");
	}
}

class B extends A{
	B(){
		System.out.println("In Class B constructor");
	}
	void display(){
		super.display();
		System.out.println("In class B");
	}
}

public class InheritanceExample {
	public static void main(String[] args){
		A a = new B();
		a.display();
	}
}
