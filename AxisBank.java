package polymorphism;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Recurring Deposit");
}
	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.deposit();
	}	
}
