package week3.Day1;

public class Studentform {
	public int getStudentInfo(int id)
	{
		return id;
	}
	public void getStudentInfo(int id,String Name)
	{
		
		System.out.println("Student ID : " +id); 
		System.out.println("Student Name is: " +Name);
	}
	public void getStudentInfo(String Email,long MobileNumber)
	{
		
		System.out.println("The Student Email is: " +Email);
		System.out.println("Student MobileNumber is : "+MobileNumber);
		
		
	}

	public static void main(String[] args) {
		Studentform Details=new Studentform();
		
		Details.getStudentInfo(1234);
		
		Details.getStudentInfo(1234, "Anitha");
		Details.getStudentInfo("anuselvaraj6594@gmail.com", 123456789);
		
		

	}

}
