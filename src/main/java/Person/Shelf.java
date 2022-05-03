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

		// Attention: ID can't be duplicated
		String ID = null;
		if (list.isEmpty()) {
			ID = MyToys.getString("Enter ID: ", "Your info you input is illegal! Please try again");
		} else {
			boolean flag = true;
			do {
				ID = MyToys.getString("Enter ID: ", "Your info you input is illegal! Please try again");
				for (int i = 0; i < list.size(); i++) {
					if (((Student) list.get(i)).getID().equalsIgnoreCase(ID)) {
						System.out.println("Student with ID: " + ID + " has been in list! Please enter different ID");
					} else {
						flag = false;
						break;
					}
				}
			} while (flag);
		}

		Person stu = new Student(classID, ID, major);

		String fullName = MyToys.getString("Enter fullName: ", "Your info you input is illegal! Please try again");
		int yearOfBirth = MyToys.getAnInteger("Enter yearOfBirth: ",
				"Your info you input is illegal! Please try again");
		String address = MyToys.getString("Enter address: ", "Your info you input is illegal! Please try again");

		// Check if the user has an email?
		String isEmail = MyToys.getString("Do you have a email ? (Y/N): ",
				"Your info you input is illegal! Please try again");
		if (isEmail.equalsIgnoreCase("Y")) {
			String email = MyToys.getString("Enter email: ", "Your info you input is illegal! Please try again");
			stu.setEmail(email);
		} else {
			stu.setEmail(" ");
		}

		String phoneNumber = MyToys.getString("Enter phoneNumber: ",
				"Your info you input is illegal! Please try again");

		stu.setFullName(fullName);
		stu.setYearOfBirth(yearOfBirth);
		stu.setAddress(address);

		stu.setPhoneNumber(phoneNumber);

		list.add(stu);
		
		System.out.println("Add student successful!");

	}

	public void showExistingStudentInfo() {
		if (list.isEmpty())
			System.out.println("Don't have any students of list");
		else {
			String ID = MyToys.getString("Enter ID you want to see: ",
					"Your info you input is illegal! Please try again");
			for (int i = 0; i < list.size(); i++) {
				if (((Student) list.get(i)).getID().equalsIgnoreCase(ID)) {
					System.out.println("Student with ID: " + ID + " has been found !");
					list.get(i).showProfile();
					return;
				}
			}

		}
	}
	
	public void showAllStudentsInTheShelf() {
		if (list.isEmpty())
			System.out.println("Don't have any students of list");
		else {
			for (Person person : list) {
				person.showProfile();
			}

		}
	}

	private void showTheListOfMajorsOnTheShelf() {
		Menu majorMenu = new Menu("MAJORS LIST");

		// Need to improve function give admin can input majors
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
	
	public void menu() {
		Menu studentManagement = new Menu("Student Management Programming");
		studentManagement.addNewOption("1. Add The New Majors Into The \"LIST MAJORS\" On The Shelf");
		studentManagement.addNewOption("2. Show The List Of Majors On The Shelf");
		studentManagement.addNewOption("3. Show All Students In The Shelf");
		studentManagement.addNewOption("4. Show Existing Student Info");
		studentManagement.addNewOption("... Exit");
		int chose;
		do {
			studentManagement.printMenu();
			chose = studentManagement.getChoice();
			switch (chose) {
			case 1:
				
				break;
			case 2:
				showTheListOfMajorsOnTheShelf();
				break;
			case 3:
				showAllStudentsInTheShelf();
				break;
			case 4:
				showExistingStudentInfo();
				break;
			case 5:
				System.err.println("THANK YOU! GOOD BYE AND SEE YOU LATER <3");
				break;

			default:
				break;
			}
		} while (chose != 5);
		
		
		
	}

//	public static void main(String[] args) {
//		Shelf se = new Shelf("SE", 1);
//		se.menu();
//
//	}

}
