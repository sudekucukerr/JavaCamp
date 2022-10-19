package homeworkExercises.week3Inheritance;

public abstract class BaseCreditManager implements ICreditManager{
	
	//abstract sınıflar bizim için ortak operasyonları tutar ama bu operasyonların tamamlanmış veya tamamnlanmamış olanlarını da tutar.
	
	public abstract void Calculate();
	
	public void Save() {
		System.out.println("Kaydedildi");
	}
	
}
