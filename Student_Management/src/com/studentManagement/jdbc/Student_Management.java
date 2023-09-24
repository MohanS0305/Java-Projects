package com.studentManagement.jdbc;

import java.util.Scanner;

public class Student_Management {

	public static void main(String[] args) {
		
		System.out.println("----Welcome To Student Management----");
		// display the choice
		System.out.println("press 1 to add student");
		System.out.println("press 2 to delete student");
		System.out.println("press 3 to update student");
		System.out.println("press 4 to display student");
		System.out.println("press 5 to exit the app");
		System.out.println();
		// enter the choice
		System.out.println("Enter the choice :");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();

		switch (choice) {
		case 1: {
			// insert student
			System.out.println("Insert student data into database");
			System.out.println();
			System.out.println("Enter the student id :");
			int sId = input.nextInt();
			input.nextLine();
			System.out.println("Enter the student name :");
			String sName = input.nextLine();
			System.out.println("Enter the student gender :");
			String sGender = input.next();
			boolean eQuery = Db_Operation.insertStudent(sId, sName, sGender);

			if (eQuery) {
				System.out.println("student data added successfully");
			} else {
				System.out.println("student data not added");
			}
			break;
		}
		case 2: {
			// delete student
			System.out.println("Delete student data into database");
			input.nextLine();
			System.out.println("Enter the student Name :");
			String sName = input.nextLine();
			boolean eQuery = Db_Operation.deleteStudent(sName);
			if (eQuery) {
				System.out.println("student data deleted successfully");
			} else {
				System.out.println("student data not deleted");
			}
			break;
		}
		case 3: {
			// update student
			System.out.println("update student data into database");
			System.out.println("press 1 to update student id :");
			System.out.println("press 2 to update student name :");
			System.out.println("press 3 to update student gender :");
			int uc = input.nextInt();
			if(uc == 1) {
				System.out.println("Enter the student id you want to update :");
				int sId = input.nextInt();
				input.nextLine();
				
				System.out.println("Enter the student name :");
				String sName= input.nextLine();
				boolean eQuery = Db_Operation.updateStudent(sId, sName);
				
				if(eQuery) {
					System.out.println("student id updated successfully");
				} else {
					System.out.println("student id not updated");
				}
			}
			
			if(uc == 2) {
				System.out.println("Enter the student name you want to update :");
				input.nextLine();
				String sName = input.nextLine();
				
				System.out.println("Enter the student id :");
				int sId= input.nextInt();
				boolean eQuery = Db_Operation.updateStudent(sName, sId);
				if(eQuery) {
					System.out.println("student name updated successfully");
				} else {
					System.out.println("student name not updated");
				}
			}
			
			if(uc == 3) {
				System.out.println("Enter the student gender you want to update :");
				input.nextLine();
				String sGender = input.nextLine();
				
				System.out.println("Enter the student name :");
				String sName = input.nextLine();
				boolean eQuery = Db_Operation.updateStudent(sGender, sName);
				if(eQuery) {
					System.out.println("student gender updated successfully");
				} else {
					System.out.println("student gender not updated");
				}
			}
			break;
		}
		case 4: {
			// display the student
			System.out.println("Display student table");
			boolean eQuery = Db_Operation.selectStudent();
			if(eQuery) {
				System.out.println("student table displayed successfully");
			} else {
				System.out.println("student table not displayed");
			}
		}
		case 5: {
			// exit the app
			break;
		}
		default:
			System.out.println("Enter the right choice");
			System.out.println("Try again....");
		}
		if (choice == 5) {
			System.out.println("Thankyou for using my application...");
			System.out.println("see you soon... bye bye.");
		}
		
		input.close();
		
	}
}
