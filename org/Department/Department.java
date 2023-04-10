package org.Department;

import org.College.College;

public class Department extends College {
	public void deptName()
	{
		System.out.println("My department Name is: ECE");
	}

	public static void main(String[] args) {
		Department Dept=new Department();
		Dept.deptName();

	}

}


