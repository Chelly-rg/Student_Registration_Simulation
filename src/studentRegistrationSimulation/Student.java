package studentRegistrationSimulation;

public class Student {
	
	private String firstName, lastName;
	private String course;
	private int year;
	private char section;
	
	Student (String firstName,
			String lastName,
			String course,
			int year,
			char section) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.year = year;
		this.section = section;
		
	}
	
	void introduceSelf () {
		System.out.println("Full Name    : " + firstName.toUpperCase() + " " +lastName.toUpperCase());
		System.out.println("Course/Y/Sec : " + course.toUpperCase() + " " + year + "-" + section);
		System.out.println();
		
	}
	
}
