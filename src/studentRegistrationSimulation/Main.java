package studentRegistrationSimulation;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		int loop = 1;
		String input1;
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" STUDENT REGISTRATION ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		while (loop == 1) {
			String firstName, lastName;
			String course;
			int year;
			char section;
			Scanner s = new Scanner(System.in);
			
			System.out.print("First Name : ");
			firstName = s.nextLine();
			System.out.print("Last Name  : ");
			lastName = s.nextLine();
			System.out.print("Course     : ");
			course = s.nextLine();
			
			while (true) {
				try {
					System.out.print("Year       : ");
					year = s.nextInt();
					s.nextLine();
					break;
				}
				
				catch (InputMismatchException e) {
					s.next();
					System.out.println();
					System.out.println("Invalid input.");
					System.out.println("Please enter a numerical data.");
					Thread.sleep(1000);
					System.out.println();
				}
			}
			
			System.out.print("Section    : ");
			section = s.nextLine().charAt(0);
			System.out.println();
			
			Student studs = new Student (firstName, lastName, course, year, section);
			students.add(studs);
			
			while (true) {
				Scanner input_1 = new Scanner(System.in);
				System.out.println();
				System.out.println("Do you want to register another student?");
				System.out.println("Yes (Y) or No (N)");
				System.out.print("Your answer : ");
				input1 = input_1.nextLine();
				System.out.println();
				
				if (input1.equalsIgnoreCase("N")) {
					loop++;
					break;
					
				} else if (input1.equalsIgnoreCase("Y")) {
					System.out.println();
					break;
					
				} else {
					System.out.println("Please choose Yes (Y) or No (N)...");
					System.out.println();
					Thread.sleep(1000);
					
				}
			
			}
		
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" STUDENT INFORMATION ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println();
		
		for(int i = 0; i < students.size(); i++) {
			System.out.println("Student #" + (i+1));
			students.get(i).introduceSelf();
			
		}
		
	}	

}
