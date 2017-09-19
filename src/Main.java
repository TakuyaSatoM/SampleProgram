
public class Main {
	public static void main(String[] args) {
		StockControl controler = new StockControl();
		System.out.println("在庫管理システム");

		controler.set("apple", 50, 7500);
		controler.set("banana", 40, 8000);
		controler.set("cherry", 30, 90000);
		controler.set("durian", 10, 10000);

		controler.addStock("cherry", -30);
		controler.calculateUnitPrice();

		System.out.println("在庫管理システム終了");
	}
}