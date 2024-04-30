package com.todolist;

import java.util.ArrayList;

public class TodoList {
	// array list for store the task
	private ArrayList<Task> tasks;
	
	// constructor for todoList
	public TodoList() {
		this.tasks = new ArrayList<>();
	}
	
	// add method for add the task
	public void addTask(Task task) {
		tasks.add(task);
	}
	
	// remove method for remove the task by task object
	public void removeTask(Task task) {
		tasks.remove(task);
	}
	
	// remove method for remove the task by index
	public void removeTask(int index) {
		if (index > 0 && index <= tasks.size()) {
			tasks.remove(index - 1);
		} else {
			System.out.println("Invalid task number");
		}
	}
	
	
	// display method for display all the task
	public void displayTasks() {
		// iterate through all the task object and print it
		for (int i = 0; i < tasks.size(); i++) {
			System.out.println((i + 1) + "." + tasks.get(i));
		}
	}
}
