package com.todolist;

public class Main {

	public static void main(String[] args) {
		Task t1 = new Task(1, "Learn Java", "2024-04-29");
		System.out.print(t1.getTaskNo() + " " + t1.getTaskName() + " " + t1.getDueDate());
	}

}
