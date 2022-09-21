package oop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product();
		product1.setDiccount(7);
		product1.setImageUrl("asdf.img");
		product1.setName("Rotring uçlu kalem ");
		product1.setUnitPrice(50);
		product1.setUnitsInStock(10);

		Product product2 = new Product();
		product2.setDiccount(7);
		product2.setImageUrl("asdf.img");
		product2.setName("Mikro uçlu kalem ");
		product2.setUnitPrice(50);
		product2.setUnitsInStock(10);

		Product product3 = new Product();
		product3.setDiccount(7);
		product3.setImageUrl("asdf.img");
		product3.setName("Faber Castel uçlu kalem ");
		product3.setUnitPrice(50);
		product3.setUnitsInStock(10);

		System.out.println("<ul>");
		Product[] products = { product1, product2, product3 };
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "<li/>");
		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone(null);
		individualCustomer.setCustomerNumber(0);
		individualCustomer.setFirstName("Hanife");
		individualCustomer.setLastName("Altıntaş");

		CorporateCustomer corporateCsutomer = new CorporateCustomer();
		corporateCsutomer.setId(2);
		corporateCsutomer.setCustomerNumber(0);
		corporateCsutomer.setPhone(null);
		corporateCsutomer.setFirstName(null);
		corporateCsutomer.setLastName(null);

		Customer[] customers = { individualCustomer, corporateCsutomer };

	}
}
