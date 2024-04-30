package com.todolist;

public class Task {
	// variables
	private String taskName;
	private String dueDate;
	
	// create constructor for task
	public Task (String tName, String dDate) {
		this.taskName = tName;
		this.dueDate = dDate;
	}
	
	// getters for access private variables
	
	public String getTaskName() {
		return taskName;
	}
	
	public String getDueDate() {
		return dueDate;
	}
	
	// toString method to override the task variables
	@Override
	public String toString() {
		return this.taskName + " " + this.dueDate;
	}
	
}
