package com.SpringCore.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired  //can't define reference in xml file
	@Qualifier("address1")//jis bean ko run krna ho
	private Address address;

	public Address getAddress() {
		return address;
	}
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Inside Setting Value");
		this.address = address;
	}

	
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	//@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}

	
	
}
