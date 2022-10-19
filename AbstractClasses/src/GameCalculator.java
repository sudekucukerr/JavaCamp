
public abstract class GameCalculator {
	
	public abstract void calculate(); //Calculate kısmını kim implemente ediyorsa Calculate'i içermek zorunda. Ama üstüne overriding yazıp belirtmeli.
	
	public final void gameOver() {		//Olduğu gibi kalacak. Final kullanıldı.
		System.out.println("Game Over.");
	}
}
