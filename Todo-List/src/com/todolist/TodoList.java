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
	// remove method for remove the task
	public void removeTask(Task task) {
		tasks.remove(task);
	}
	
	// display method for display all the task
	public void displayTasks() {
		// iterate through all the task object and print it
		for (Task task : tasks) {
			System.out.println(task);
		}
	}
}
