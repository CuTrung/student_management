package Person;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Formatter;
import java.util.Random;

public class Student extends Person implements Examination, Activities {
	private String classID;
	private String ID;
	private String major;
	private double GPA;
	private Random rd = new Random();

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

	
	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean isEmail(String answer) {
		if (answer.equalsIgnoreCase(" ")) {
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

	@Override
	public void doTheTest(boolean isDoTheTest) {
		if (isDoTheTest) {
			GPA = Math.round((rd.nextDouble() + 1) * 2 * 100.0) / (100.0);
			System.out.println("Your GPA: " + GPA);
		} else {
			System.out.println("You don't do the test");
		}

	}
	

	@Override
	public void playSport(String sex) {
		// Use default interface method
		Activities.super.studies();
		if (sex.equalsIgnoreCase("male")) {
			System.out.println("Beside that, I usually play football");
		} else {
			System.out.println("Beside that, I usually go swimming");
		}

	}

}
