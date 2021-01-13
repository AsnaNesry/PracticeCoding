package assignmentsales;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemManagement {

	public List<ItemDetails> addItem() {
		List<ItemDetails> itemList = new ArrayList<ItemDetails>();
		System.out.println("How many items you need to add:");
		Scanner sc = new Scanner(System.in);
		int itemDetailsReq = sc.nextInt();

		System.out.println("enter item details\n ItemNO  ItemName  ItemPrice  ItemQuantity\n");

		for (int i = 1; i <= itemDetailsReq; i++) {

			ItemDetails item1 = new ItemDetails();
			item1.setItemNO(sc.nextInt());
			item1.setItemName(sc.next());
			item1.setItemPrice(sc.nextInt());
			item1.setItemQuantity(sc.nextInt());
			itemList.add(item1);
		}
		boolean isValid = validateItem(itemList);
		if (!isValid) {
			addItem();
		}
		return itemList;

	}

	public boolean validateItem(List<ItemDetails> itemList) {
		boolean isValid = true;
		SalesManagement sm = new SalesManagement();
		for (ItemDetails item : itemList) {
			if ((item.getItemPrice() <= 0)) {
				System.out.println("item Price should be greater than 0");
				isValid = false;
			}

			if ((item.getItemQuantity() <= 0)) {
				System.out.println("item Quantity shoulbe greater than 0");
				sm.displayAdminMenu();
				isValid = false;
			}

		}
		return isValid;
	}

	public void displayItemList(List<ItemDetails> itemList) {
		System.out.println("ItemNO  ItemName  ItemPrice  ItemQuantity\n");
		for (ItemDetails item : itemList) {
			System.out.println(item);

		}
	}

	public void saveItemDetails(List<ItemDetails> itemList) {
		try (ObjectOutputStream objstream = new ObjectOutputStream(new FileOutputStream("D:\\Item.txt"))) {
			objstream.writeObject(itemList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<ItemDetails> loadItemDetails() {
		List<ItemDetails> itemList = null;
		try (ObjectInputStream objstream1 = new ObjectInputStream(new FileInputStream("D:\\Item.txt"))) {
			itemList = (List<ItemDetails>) objstream1.readObject();

		} catch (IOException | ClassNotFoundException cnf) {
			System.out.println("Exception during serialization..........");

		}
		return itemList;
	}
}
