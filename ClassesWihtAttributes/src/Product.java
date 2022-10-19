public class Product {
	
	public Product(int id, String name, String description, double price, int stockAmount, String renk, String kod) {
		System.out.println("Yapıcı blok çalıştı.");
		this.id = id;
		this.renk = renk;
		this.description = description;
		this.name = name;
		this.stockAmount = stockAmount;
		this.price = price;
		
	}
	
	public Product() {
		
	}

	// attribute : field
	// yazılmayan hepsi default olarak public alınır.
	// Private olmasını istiyorsak özellikle yazarız.
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	// GETTER
	public int getId() { // Bu id'yi yazamaz ama okuyabilir demektir.
		return id;
	}

	// SETTER
	public void setId(int id) {
		this.id = id; // this: içinde bulunduğumuz class demektir.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() { //Kodu yazılabilir istemediğimizden set'ini sildik.
		return this.name.substring(0,1) + id;
	}

	
}
