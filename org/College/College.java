package org.College;

public class College {
	public void collegeName()
	{
		System.out.println("My college Name is: Holycross Engineering College");
	}
	public void collegeCode()
	{
		System.out.println("My college Code is: 9509");
	}
	public void collegeRank()
	{
		System.out.println("Ranking number is: 9");
	}
	public static void main(String[] args) {
		
		College colDetails=new College();
		
		colDetails.collegeName();
		colDetails.collegeCode();
		colDetails.collegeRank();	

	}

}
