package Bai_8;

public abstract class Person {
	private String lastName;
	private String  firstName;
	
	
	public Person(String firstName,String lastName) {
		super();
		setLastName(lastName);
		setfirstName(firstName);
	}
	
	public Person() {
		super();
	}

	public String getLastName() {
		return lastName;
	}

	public String getString() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Override
	public String toString() {
		return firstName+" "+lastName;
	}
}
