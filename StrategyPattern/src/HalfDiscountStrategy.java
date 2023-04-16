
public class HalfDiscountStrategy implements IPromateStrategy{

	@Override
	public double DoDisCount(double price) {
		
		return price*0.5;
	}

}
