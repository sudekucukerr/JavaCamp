
public class Main {

	public static void main(String[] args) {
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.calculate();
		womanGameCalculator.gameOver();
		
//		GameCalculator gameCalculator = new GameCalculator() { //Abstract sınıflar new'lenemez. Bu yüzden override yapmak gerekir. Ama bu yöntem doğru değildir, uğraştırır.
//			
//			@Override
//			public void calculate() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		GameCalculator gameCalculator = new WomanGameCalculator();
	}

}
