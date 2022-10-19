
public class MainClass {

	public static void main(String[] args) {
//		Product product = new Product( id:1 , name: "Laptop", description: "Huawei Laptop", price: 7000, stockAmount: 3, renk: "siyah");

		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Huawei Laptop");
		product.setPrice(7000);
		product.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
