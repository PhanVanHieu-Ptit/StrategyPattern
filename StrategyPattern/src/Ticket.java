
public class Ticket {
	private IPromateStrategy promateStrategy;
	private double price;
	private String name;

	public IPromateStrategy getPromateStrategy() {
		return promateStrategy;
	}

	public void setPromateStrategy(IPromateStrategy promateStrategy) {
		this.promateStrategy = promateStrategy;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ticket() {

	}

	public Ticket(IPromateStrategy promateStrategy) {

		this.promateStrategy = promateStrategy;
	}

	public double GetPromotedPrice() {
		return promateStrategy.DoDisCount(price);
	}
}
