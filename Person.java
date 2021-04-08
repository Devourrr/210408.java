package week3_day4;

public class Person {
	String name;
	int age;
	
	public Person() {}
	public Person( String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + " 	" + age;
		
	}
}
