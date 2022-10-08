package com.workallotment.service;

public class HRDepartment extends SuperDepartment{
	
	private String departmentName() {
		return "Welcome to HR Department";
	}
	
	private String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}
	
	private String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	private String doActivity() {
		return "Team Lunch";
	}
	
	public void display() {
		System.out.println(departmentName());
		System.out.println(getTodaysWork());
		System.out.println(getWorkDeadline());
		System.out.println(doActivity());
		System.out.println(isTodayAHoliday());
		System.out.println("------------------------");
	}

}
