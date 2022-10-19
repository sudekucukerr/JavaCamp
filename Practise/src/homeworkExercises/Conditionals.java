package homeworkExercises;
import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		
		Float sayi;
		Scanner scanf = new Scanner(System.in);
		System.out.println("Sayıyı Giriniz: ");
		sayi = scanf.nextFloat();
		
		if(sayi<20) {
			System.out.println("Sayı 20'den küçüktür");
		} else if(sayi==20) {
			System.out.println("Sayı 20'ye eşittir.");
		} else {
			System.out.println("Sayı 20'den büyüktür.");
		}
		
		
		 
	}

}
