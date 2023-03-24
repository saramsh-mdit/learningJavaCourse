// Package Name
package School;

public class Student {
	String name;
	int roll;
	
//Constructor
	public Student() {
		this.name = "Unknwon";
		this.roll = 0;
	}
//Constructor Overloading
	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	public String getName() {
		return this.name;
	}
	public int getRoll() {
		return this.roll;
	}
	
	public void display() {
		System.out.println(this.name + " roll is " + String.valueOf(this.roll) );
	}
}

