package Person;

public abstract class Person {
	protected String fullName;
	protected int yearOfBirth;
	protected String address;
	protected String email;
	protected String phoneNumber;

	public Person() {
		super();
	}

	public Person(String fullName, int yearOfBirth, String address, String email, String phoneNumber) {
		super();
		this.fullName = fullName;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}



	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {		
		return super.toString();
	}
	
	public abstract boolean isEmail(String answer);

	public void showProfile() {
		System.out.printf("%-15s|%4s|%-30s|%-12s|%-30s|", fullName, yearOfBirth, address, phoneNumber, email);
	}

	
}


