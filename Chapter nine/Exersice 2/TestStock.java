public class TestStock{
	public static void main(String[] args) {
		Stock stock = new Stock("IDK","ANW");
		stock.currentPrice = 115.5;
		stock.setCurrentPrice(120.5);
		System.out.println("The price change percentage is " + stock.getChangePercent());

	}
}