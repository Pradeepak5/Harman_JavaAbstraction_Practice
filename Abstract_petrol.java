package harman.practice.com;
import java.util.*;

abstract public class Abstract_petrol {
	abstract public void PetrolPrice();
}
class Price extends Abstract_petrol{
	public void PetrolPrice() {
		System.out.println("INR, 101.54");
	}
	public static void main(String args[]) {
		Price p=new Price();
		p.PetrolPrice();
	}
	
}
