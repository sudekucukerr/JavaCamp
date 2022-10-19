package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade oranı";
		
		Product product1 = new Product();	
		product1.setName("Delongji Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.url");
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(8);
		product2.setUnitPrice(8500);
		product2.setUnitInStock(4);
		product2.setImageUrl("image2.url");
			
		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(9);
		product3.setUnitPrice(9500);
		product3.setUnitInStock(5);
		product3.setImageUrl("image3.url");
		
		Product[] products = {product1, product2, product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05451112233");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Sude");
		individualCustomer.setLastName("Küçüker");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05450001122");
		corporateCustomer.setTaxNumber("1111");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
	}

}
