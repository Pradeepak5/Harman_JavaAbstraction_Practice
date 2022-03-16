package harman.practice.com;

abstract class RBI_Bank {
	abstract void setInterestRate();

}
class SBI extends RBI_Bank{
	void setInterestRate() {
		System.out.println("7%");
	}
}
class ICICI extends RBI_Bank{
	void setInterestRate() {
		System.out.println("7.5%");
		
	}
}
class ABCD_Bank{
	public static void main(String[]args) {
		RBI_Bank sbi_obj=new SBI();
		RBI_Bank icici_obj=new ICICI();
		System.out.println("SBI Interest rate");
		sbi_obj.setInterestRate();
		System.out.println("ICICI Interest rate");
		icici_obj.setInterestRate();
	}
}