package com.gl.service;

public class AdminDepartment extends SuperDepartment{
	
	private String departmentName() {
		return "Welcome to Admin Department";
	}
	
	private String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	private String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public void display() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(isTodayAHoliday());
		
	}

}
