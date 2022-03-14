package com.anshuman.company.services;

import java.util.LinkedList;
import java.util.List;

import com.anshuman.company.model.AdminDepartment;
import com.anshuman.company.model.HRDepartment;
import com.anshuman.company.model.SuperDepartment;
import com.anshuman.company.model.TechDepartment;

public class DepartMentService {
	
	public void executeDepartment() {
		List<SuperDepartment> departments = new LinkedList<SuperDepartment>();
		departments.add(new AdminDepartment());
		departments.add(new HRDepartment());
		departments.add(new TechDepartment());
		
		for(SuperDepartment sd : departments) {
			sd.showFuctionality();
			System.out.println();
			
		}
		
	}

}
