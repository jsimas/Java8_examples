package part4io;

class Person {
	String lastName;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

public class Comparator {

	public static void main(String[] args) {
		java.util.Comparator<Person> c = java.util.Comparator.comparing(Person::getLastName);
		//.thenComparing(Person::getFirstName)
		
		//c.reversed(); Reversed
		
	}
}
