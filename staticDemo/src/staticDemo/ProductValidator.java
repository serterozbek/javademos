package staticDemo;

public class ProductValidator {

	static {
		System.out.println("Statik Yap�c� blok �al��t�(Constructor)");
	}

	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�(Constructor)");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

	public void bisey() {

	}

	public static class BaskaBirClass {
		public static void Sil() {

		}
	}
	//inner class
}
