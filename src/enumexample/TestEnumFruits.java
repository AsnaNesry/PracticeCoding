package enumexample;

public class TestEnumFruits {

	public static void main(String[] args) {
		System.out.println(Fruits.APPLE.getPrice());

		System.out.println("All fruits prices: ");

		for (Fruits fruits : Fruits.values()) {
			System.out.println(fruits + "costs  " + fruits.getPrice() + "  Rupees");

		}

	}

}
