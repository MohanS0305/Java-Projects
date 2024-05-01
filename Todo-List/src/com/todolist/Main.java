package com.todolist;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// create scanner object for input
		try (Scanner input = new Scanner(System.in)) {
			// create object for todoList class
			TodoList todoList = new TodoList();

			// manually add some task
			todoList.addTask(new Task(1, "wake up 5'O clock", "2024-04-30"));
			todoList.addTask(new Task(2, "do some exercise", "2024-04-30"));
			todoList.addTask(new Task(3, "make breakfast", "2024-04-30"));

			// display the current task
			System.out.println("Current Tasks :");
			todoList.displayTasks();
			
			// create object for userTaskInput class
			UserTaskInput uti = new UserTaskInput();

			// call the userChoice method ask the choice store it in choice
			int choice = uti.userChoice();
			while (choice > 0 && choice != 4) {
				switch (choice) {
				case 1 -> {
					uti.addTheTask(todoList); // call addTheTask method 
				}
				case 2 -> {
					uti.removeTheTask(todoList); // call removeTheTask method
				}
				case 3 -> {
					// display the updated task
					System.out.println("Updated Tasks :");
					todoList.displayTasks();
				}
				default -> System.out.println("\nInvalid choice pls enter correct choice");
				}
				// after perform each operation ask the choice again
				choice = uti.userChoice();
			}
			System.out.println("\nThank you bye bye...");
		}
	}
}
