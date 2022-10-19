
public class MainClass {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// Class'lar referans tiptir.

		// Stack ve Heap
		// Stack'te kodun düzgün okunabilmesi önemlidir. Class'ı kullanabilmek için
		// New'lemek önemlidir
		
		//Herhangi bir referansı tutan bir şey kalmazsa, Heap içinde garbage ile bellekten silinir.
		
		//-----------
		
		//VALUE (Değer Tipleri)
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2); //Cevap: 10
		//Değer tiplerde sıra önemlidir. 
		
		
		int[] sayilar1 = new int[]{1,2,3};
		int[] sayilar2 = new int[]{4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]); //Cevap : 10
		//Diziler referans tiptir.
		
		
		
		
		
		
	}

}
