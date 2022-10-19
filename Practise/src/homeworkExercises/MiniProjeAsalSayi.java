package homeworkExercises;

public class MiniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 29;
		int remainder = number % 2;
		System.err.println(remainder);
		
		boolean isPrime = true;
		
		// Yazılan sayının asal olup olmadığını bulunuz.
		
		if(number==1) {
			System.out.println("Sayı Asal değildir.");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayı girdiniz.");
		}
		
		for(int i = 2; i < number; i++)
        {
            if(number % i == 0) {
                isPrime = false;
            }
        }
        if(isPrime) {
            System.out.println("Asal bir sayidir.");
        }
        else {
            System.out.println("Asal bir sayi degildir.");
        }

	}

}
