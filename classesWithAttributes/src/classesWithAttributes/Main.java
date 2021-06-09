package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		//ÝKÝ YÖNTEM DE KULLANILABÝLÝR.
		//OVERLOADING
		Product product2=new Product(2,"Bilgisayar","Hp Bilgisayar",3000,5,"Gri");
		
		
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
	}

}
