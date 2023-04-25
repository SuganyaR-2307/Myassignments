package weekthree.day1;

public class AxisBank extends BankInfo {
	public void deposit()
	{
		int axisDep=20000;
		System.out.println("Axis Deposit Amount: "+axisDep);
	}
	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		axis.deposit();

		BankInfo b=new BankInfo();
		b.deposit();
		
	}

}
