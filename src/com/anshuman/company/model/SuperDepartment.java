package com.anshuman.company.model;


public abstract  class SuperDepartment {
	
public String getDepartmentName() {
	return "Super Department";	
}

public String getTodaysWork() {
	return "No Work as of now";
	
}

public String getWorkDeadline() {
	return "Nil";
	
}


public String isTodayAHoliday() {
	return "Today is not a holiday";
}

public void showFuctionality() {
	System.out.println("Welcome to "+ getDepartmentName() + ".");
	System.out.println(getTodaysWork());
	System.out.println(getWorkDeadline());
	System.out.println(isTodayAHoliday());
	
}

}
