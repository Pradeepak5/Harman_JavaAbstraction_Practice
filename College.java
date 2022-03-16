package harman.practice.com;

public interface College {
	void setAcademicFee();

}
class CSE_Dept implements College{
	public void setAcademicFee() {
		System.out.println("INR 75000");
		}
	
}
class MECH_Dept implements College{
	public void setAcademicFee() {
		System.out.println("INR 95000");
	}
}
class AddministrativeOffice{
	public static void main(String args[]) {
		College ob_cse=new CSE_Dept();
		College ob_mech=new MECH_Dept();
		System.out.println("CSE Fees");
		ob_cse.setAcademicFee();
		System.out.println("MECH Fees");
		ob_mech.setAcademicFee();
	}
}
