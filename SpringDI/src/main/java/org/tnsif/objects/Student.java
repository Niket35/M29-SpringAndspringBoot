package org.tnsif.objects;

public class Student {
	
	//DI in the form of object
	Address address;
	
	
	public Student(Address address) {
		super();
		this.address = address;
	}
	
	public void print() 
	{
		address.display();
	}
	
}
