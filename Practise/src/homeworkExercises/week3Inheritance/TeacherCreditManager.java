package homeworkExercises.week3Inheritance;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
		//hesaplamalar
		System.out.println("Öğretmen Kredisi hesaplandı.");
		
	}

	@Override
	public void Save() {
		System.out.println("Öğretmen Kredisi kaydedildi.");
		
	}

}
