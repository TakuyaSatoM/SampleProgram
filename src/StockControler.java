import java.util.ArrayList;

public class StockControler {
	private static ArrayList<Item> ItemList;
	private int ItemID;

	public StockControler() {
		ItemList = new ArrayList<Item>();
		ItemID = 0;
	}

	public void set(String name, int weight, int price) {
		Item item = new Item(ItemID, name, weight, price);
		ItemList.add(item);
		ItemID++;

		System.out.println("�݌�" + name + "��o�^���܂���");

		return;
	}

	public void addStock(String name, int weight, int Amount) {
		Item item = null;
		item = searchItem(name);

		if (item == null) {
			System.out.println("�Y������݌ɂ����݂��܂���B");
			return;
		}

		item.addWeight(weight);
		item.addPrice(Amount);
		System.out.println(name + "��" + weight + "kg�ǉ����܂����B");
	}

	public Item searchItem(String SearchName) {
		int i = 0;
		Item item = null;
		String name = "";
		Item result = null;

		while (i < ItemList.size()) {
			item = ItemList.get(i);
			name = item.getName();

			if (name.equals(SearchName)) {
				result = item;
			}
			i++;
		}

		return result;
	}

	public void searchInfo(int id) {
		Item item;
		try {
			item = ItemList.get(id);
			item.print();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("�Y������݌ɂ����݂��܂���B");
		}
		return;
	}

	public void calculateUnitPrice() {
		Item item;
		int weight = 0;
		int totalPrice = 0;
		int unitPrice = 0;
		String name;

		for (int i = 0; i < ItemList.size(); i++) {
			try {
				item = ItemList.get(i);
				name = item.getName();
				weight = item.getWeight();
				totalPrice = item.getTotalPrice();
				unitPrice = totalPrice / weight;
				System.out.println(weight);
				System.out.println(name + ":" + unitPrice);
			} catch (ArithmeticException e) {
				System.out.println("�݌ɂȂ�");
			}
		}
		System.out.println();
		return;
	}

	public void addStockUnderWeight(int baseWeight, int addWeight) {
		for (int i = 0; i < ItemList.size(); i++) {
			Item item = ItemList.get(i);
			int itemWeight = item.getWeight();
			if (baseWeight > itemWeight) {
				item.addWeight(addWeight);
			}
		}
		System.out.println(baseWeight + "�ȉ��̍݌ɂ�" + addWeight + "kg�ǉ����܂����B");
	}
}
