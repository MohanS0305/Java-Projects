package com.todolist;

public class Task {
	// variables
	private int taskNo;
	private String taskName;
	private String dueDate;

	// create constructor for task
	public Task(int tNo, String tName, String dDate) {
		this.taskNo = tNo;
		this.taskName = tName;
		this.dueDate = dDate;
	}

	// getters for access private variables
	public int getTaskNo() {
		return this.taskNo;
	}

	public String getTaskName() {
		return taskName;
	}

	public String getDueDate() {
		return dueDate;
	}

	// toString method to override the task variables
	@Override
	public String toString() {
		return this.taskNo + " " + this.taskName + " " + this.dueDate;
	}

}
