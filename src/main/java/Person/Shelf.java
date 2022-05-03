package Person;

import java.util.ArrayList;
import java.util.List;

import MyHandmadeTools.Menu;
import MyHandmadeTools.MyToys;

public class Shelf {
	private String majorShelf;
	private int floor;
	private List<Person> list = new ArrayList<Person>();

	public Shelf() {
		super();
	}

	public Shelf(String majorShelf, int floor) {
		super();
		this.majorShelf = majorShelf;
		this.floor = floor;
	}

	public String getMajorShelf() {
		return majorShelf;
	}

	public void setMajorShelf(String majorShelf) {
		this.majorShelf = majorShelf;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public void enterStudentInfo(String major) {
		String classID = MyToys.getString("Enter classID: ", "Your info you input is illegal! Please try again");
		String ID = MyToys.getString("Enter ID: ", "Your info you input is illegal! Please try again");
		
		Person stu = new Student(classID, ID, major);

		String fullName = MyToys.getString("Enter fullName: ", "Your info you input is illegal! Please try again");
		int yearOfBirth = MyToys.getAnInteger("Enter yearOfBirth: ",
				"Your info you input is illegal! Please try again");
		String address = MyToys.getString("Enter address: ", "Your info you input is illegal! Please try again");
		String email = MyToys.getString("Enter email: ", "Your info you input is illegal! Please try again");
		String phoneNumber = MyToys.getString("Enter phoneNumber: ",
				"Your info you input is illegal! Please try again");

		stu.setFullName(fullName);
		stu.setYearOfBirth(yearOfBirth);
		stu.setAddress(address);
		// If has email
		stu.setEmail(email);
		stu.setPhoneNumber(phoneNumber);

		list.add(stu);

		System.out.println("Add student successful!");
		
		list.get(0).showProfile();
	}
	
	public void enterPersonInfo() {
		
	}

	private void showTheListOfMajorsOnTheShelf() {
		Menu majorMenu = new Menu("MAJORS LIST");

		majorMenu.addNewOption("1. Software Engineering (SE)");
		majorMenu.addNewOption("2. Graphic Design (GD)");
		majorMenu.addNewOption("3. Embedded Programming (EP)");
		majorMenu.addNewOption("4. Web Developer (WD)");
		majorMenu.addNewOption("5. Mobile App Developer (MAD)");
		
		majorMenu.printMenu();
		String nameMajor;
		switch (majorMenu.getChoice()) {
		case 1:
			nameMajor = "SE";
			enterStudentInfo(nameMajor);
			break;
		case 2:
			nameMajor = "GD";
			enterStudentInfo(nameMajor);
			break;
		case 3:
			nameMajor = "EP";
			enterStudentInfo(nameMajor);
			break;
		case 4:
			nameMajor = "WD";
			enterStudentInfo(nameMajor);
			break;
		case 5:
			nameMajor = "MAD";
			enterStudentInfo(nameMajor);
			break;
		default:
			break;
		}

	}

	public static void main(String[] args) {
		Shelf se = new Shelf("SE", 1);
		//se.enterStudentInfo();
		se.showTheListOfMajorsOnTheShelf();
	}
}
