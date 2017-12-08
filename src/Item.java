
public class Item {
	private int id;
	private String name;
	private int totalWeight;
	private int totalPrice;

	public Item(int id, String name, int weight, int price) {
		this.id = id;
		this.name = name;
		this.totalWeight = weight;
		this.totalPrice = price;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return totalWeight;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void addWeight(int weight) {
		this.totalWeight = weight;
	}

	public void addPrice(int price) {
		this.totalPrice += price;
	}

	public void print() {
		System.out.println("ID:" + this.id);
		System.out.println("Name:" + this.name);
		System.out.println("Stock:" + this.totalWeight);
		System.out.println("Unit Price:" + this.totalPrice);

		return;
	}

}