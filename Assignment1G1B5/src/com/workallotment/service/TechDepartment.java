package com.workallotment.service;

public class TechDepartment extends SuperDepartment{
	
	private String departmentName() {
		return "Welcome to Tech Department";
	}
	
	private String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	private String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	private String getTechStackInformation() {
		return "Core Java";
	}
	
	public void display() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(getTechStackInformation());
		System.out.println(isTodayAHoliday());
		System.out.println("------------------------");
	}

}
