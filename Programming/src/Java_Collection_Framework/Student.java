package Java_Collection_Framework;

import java.util.Objects;

public class Student {
	
	private int rollno;
	private String name;
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	//HashCode Generated kisse compair krna h
	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollno == other.rollno;
	}
	
	

}
