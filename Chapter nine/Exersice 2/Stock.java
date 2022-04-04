public class Stock{
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;

	Stock(String symbol, String name){
		this.symbol = symbol;
		this.name = name;
	}

	void setCurrentPrice(double price){
		previousClosingPrice = currentPrice;
		currentPrice =  price;
	}

	double getChangePercent(){
		return (currentPrice - previousClosingPrice)/previousClosingPrice; 
	}
}