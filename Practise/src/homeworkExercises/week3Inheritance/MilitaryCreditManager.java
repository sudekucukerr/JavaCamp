package homeworkExercises.week3Inheritance;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {

	
	public void Calculate() {
		//hesaplamalar
		System.out.println("Asker Kredisi hesaplandı.");
		
	}

	public void Save() {
		System.out.println("Asker Kredisi kaydedildi.");
		
	}

}
