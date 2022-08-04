package Java_Collection_Framework;

public class Student_Comparable implements Comparable<Student_Comparable> {
	int rollno;
	String name;
	int age;

	public Student_Comparable(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student_Comparable st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}

}
