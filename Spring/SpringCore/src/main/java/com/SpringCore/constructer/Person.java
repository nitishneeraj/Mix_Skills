package com.SpringCore.constructer;

public class Person {
	private String name;
	private int personid;
	private Certi certi;
	public Person(String name, int personid, Certi certi) {
		//super();
		this.name = name;
		this.personid = personid;
		this.certi=certi;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" : "+this.personid+"{"+this.certi.name+"}";
	}
	
	
	

}
