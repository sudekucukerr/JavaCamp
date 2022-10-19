package homeworkExercises.week3Inheritance;

public class CustomerManager {
	
    Customer customer;
	ICreditManager creditManager;
	
	
	public CustomerManager(Customer customer, ICreditManager creditManager) { //Polymorphism : çok biçimlilik 
		this.customer = customer;
		this.creditManager=creditManager;
	}
	
	public void Save() {
		System.out.println("Müşteri kaydedildi: ");
	}

	public void Delete() {
		System.out.println("Müşteri silindi: ");
	}
	
	public void GiveCredit() {
		
		System.out.println("Kredi verildi.");
		creditManager.Calculate();
		creditManager.Save();
	}
	
	
}
