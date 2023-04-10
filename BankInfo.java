package week3.Day1;

public class BankInfo {
	public void saving()
	{
		System.out.println("The Saving account Balance is: Rs.100000");
	}
	public void fixed()
	{
		System.out.println("The fixed Balance is:Rs.2000000");
	}
	public void deposit()
	{
		System.out.println("The deposited Balance is:Rs.500000");
		
	}
	

	public static void main(String[] args) {
		BankInfo AccountDetails=new BankInfo();
		AccountDetails.saving();
		AccountDetails.fixed();
		AccountDetails.deposit();
		
	}

}
