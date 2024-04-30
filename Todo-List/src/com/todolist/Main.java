package com.todolist;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// create object for todoList class
			TodoList todoList = new TodoList();

			// manually add some task
			todoList.addTask(new Task("wake up 5'O clock", "2024-04-30"));
			todoList.addTask(new Task("do some exercise", "2024-04-30"));
			todoList.addTask(new Task("make breakfast", "2024-04-30"));

			// display the current task
			System.out.println("Current Tasks :");
			todoList.displayTasks();

			// ask choice for user want to add or remove the task and exit
			System.out.println("\nEnter any one choice : 1, 2, 3 or 4");
			System.out.println("1. Add the task \n 2. Remove the task \n 3. Display updated tasks \n 4. Exit");
			int choice = input.nextInt();
			while (choice > 0 && choice != 4) {
				switch (choice) {
				case 1 -> {
					// ask the input for task from user end
					// this nexLine() for skipping purpose
					input.nextLine();
					// ask taskName as input
					System.out.println("Enter the task name :");
					String taskName = input.nextLine();
					// ask task dueDate as input
					System.out.println("Enter the task due date :");
					String dueDate = input.nextLine();
					// add all this input in tasks array list
					todoList.addTask(new Task(taskName, dueDate));
					choice = 0;
				}
				case 2 -> {
					// ask the input for remove task
					System.out.println("Enter the task number :");
					int removeTask = input.nextInt();
					todoList.removeTask(removeTask);
					choice = 0;
				}
				case 3 -> {
					// display the updated task
					System.out.println("Updated Tasks :");
					todoList.displayTasks();
					choice = 0;
				}
				default -> System.out.println("Invalid choice");
				}
			}
			System.out.println("Thank you bye bye...");
		}
	}
}
