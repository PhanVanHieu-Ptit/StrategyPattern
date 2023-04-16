
public class NoDiscountStrategy implements IPromateStrategy{

	@Override
	public double DoDisCount(double price) {
		
		return price;
	}

}
