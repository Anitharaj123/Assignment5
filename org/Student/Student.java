package org.Student;
//Multi level inheritance

import org.Department.Department;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("Anitha");
	}
	public void studentDept()
	{
		System.out.println("ECE");
	}
	public void studentId()
	{
		System.out.println("950911106004");
	}



	public static void main(String[] args) {
		Student Alldetails=new Student();
			Alldetails.collegeName();
			Alldetails.collegeCode();
			Alldetails.collegeRank();
			Alldetails.deptName();
			Alldetails.studentName();
			Alldetails.studentId();
			Alldetails.studentDept();

	}

}
