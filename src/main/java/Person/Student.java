package Person;



public class Student extends Person {
	private String classID;
	private String ID;
	private String major;

	public Student() {
		super();
	}

	public Student(String classID, String iD, String major) {
		super();
		this.classID = classID;
		ID = iD;
		this.major = major;
	}

	public String getClassID() {
		return classID;
	}

	public void setClassID(String classID) {
		this.classID = classID;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean isEmail(String answer) {
		if(answer.equalsIgnoreCase(" ")) {
			return false;
		}

		return true;
	}

	
	@Override
	public void showProfile() {
		super.showProfile();
		System.out.printf("%-10s|%-10s|%-10s|", major, classID, ID);
		System.out.println();
	}

}
