
public class BaseCreditManager {
	
	public double calculate (double amount) { //If we write "final" here, another classes cannot use override. 
		return amount * 1.18; 
	}
}
