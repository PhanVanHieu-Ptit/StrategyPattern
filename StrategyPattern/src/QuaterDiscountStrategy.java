
public class QuaterDiscountStrategy implements IPromateStrategy{

	@Override
	public double DoDisCount(double price) {
		
		return price*0.75;
	}

}
