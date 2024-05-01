package com.todolist;

import java.util.LinkedList;

public class TodoList {
	// array list for store the task
	private LinkedList<Task> tasks;
	
	// constructor for todoList
	public TodoList() {
		this.tasks = new LinkedList<>();
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
		for(Task task : tasks) {
			System.out.println(task);
		}
	}
}
