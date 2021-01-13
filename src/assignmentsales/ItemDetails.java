package assignmentsales;

public class ItemDetails implements java.io.Serializable {

	private int itemNO = 0;
	private String itemName;
	private int itemPrice = 0;
	private int itemQuantity = 0;

	public int getItemNO() {
		return itemNO;
	}

	public void setItemNO(int itemNO) {
		this.itemNO = itemNO;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {

		this.itemPrice = itemPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	@Override
	public String toString() {

		return itemNO + "     " + itemName + "          " + itemPrice + "            " + itemQuantity;
	}

}
