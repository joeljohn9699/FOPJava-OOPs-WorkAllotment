package com.workallotment.service;

public class SuperDepartment {
	
	private String departmentName() {
		return "Super Department";
	}
	
	private String getTodaysWork() {
		return "No Work as of now";
	}
	
	private String getWorkDeadline() {
		return "Nil";
	}
	
	protected String isTodayAHoliday() {
		return "Today is not a Holiday";
	}
	
	public void display() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		System.out.println("------------------");
	}
}
