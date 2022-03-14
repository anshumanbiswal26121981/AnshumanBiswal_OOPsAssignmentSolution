package com.anshuman.company.model;


public class AdminDepartment extends SuperDepartment {
	
	@Override
	public String getDepartmentName() {
		return "Admin Department";	
	}

	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
		
	}

	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
		
	}
	

}
