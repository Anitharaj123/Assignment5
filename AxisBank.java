package week3.Day1;
//Overriding

public class AxisBank extends BankInfo {
	public void deposit()
	{
		System.out.println("The deposited Balance is:Rs.600000");
		
	}
	

	public static void main(String[] args) {
		AxisBank Balance=new AxisBank();
		Balance.deposit();
		Balance.saving();
		Balance.fixed();

	}

}
