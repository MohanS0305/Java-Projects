package com.todolist;

import java.util.Scanner;

public class UserTaskInput {
	Scanner input = new Scanner(System.in);
	// ask user choice for add, remove and update the task and exit
	public int userChoice() {
		System.out.println("\nEnter any one choice : 1, 2, 3 or 4");
		System.out.println("1. Add the task \n 2. Remove the task \n 3. Display updated tasks \n 4. Exit");
		int choice = input.nextInt();
		return choice;
	}
	
	// ask user input for add the task
	public void addTheTask(TodoList todoList) {
		// ask taskNo as input
		System.out.println("Enter the task number :");
		int taskNo = input.nextInt();
		// this nexLine() for skipping purpose
		input.nextLine();
		// ask taskName as input
		System.out.println("Enter the task name :");
		String taskName = input.nextLine();
		// ask task dueDate as input
		System.out.println("Enter the task due date :");
		String dueDate = input.nextLine();
		// add all this input in tasks array list
		todoList.addTask(new Task(taskNo,taskName, dueDate));
	}
	
	// ask user input for remove the task
	public void removeTheTask(TodoList todoList) {
		System.out.println("Enter the task number :");
		int removeTask = input.nextInt();
		todoList.removeTask(removeTask);
	}
}
