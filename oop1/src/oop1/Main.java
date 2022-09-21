package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		// set value
		/*product1.name = "Delonghi Coffee machine";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "pic.jpg";*/
		
		product1.setName("Delonghi Coffee Machine");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("img1.jpg");

		
		Product product2 = new Product();
		product2.setName("Smeg Coffee Machine");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("img1.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Coffee Machine");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("img3.jpg");
		
		
		Product[] products = {product1, product2, product3};
		
		System.out.println("<ul>");
		for(Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("0555555555");
		individualCustomer.setCustomerNumber("5555");
		individualCustomer.setFirstName("Aylin");
		individualCustomer.setLastName("Yıldız");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhoneNumber("0511111111");
		corporateCustomer.setTaxNumber("1111111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
	}

}
