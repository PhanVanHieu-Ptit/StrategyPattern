
public class Main {
	public static void main(String[] args) {
		System.out.println("Start!!!");

		for (int i = 1; i <= 5; i++) {

			Ticket ticket = new Ticket();
			ticket.setName("Ticket " + i);
			ticket.setPrice(50.0 * i);

			generatePromoteStrategy(ticket);
			LogTicketDetails(ticket);

//			generatePromoteStrategy(ticket);
//			LogTicketDetails(ticket);

		}
	}

	private static void LogTicketDetails(Ticket ticket) {
		System.out.println(ticket.getName()+"\n"
				+" Type ticket:" + ticket.getPromateStrategy().getClass().getName()
				+"; Before promote: "+ ticket.getPrice() 
				+"; After Promote: " + 
				+ ticket.GetPromotedPrice() + "\n");

	}

	private static void generatePromoteStrategy(Ticket ticket) {
		int max = 3;
		int min = 0;
		int strategyIndex = (int) Math.floor(Math.random() * (max - min + 1) + min);
		switch (strategyIndex) {
		case 0: {

			ticket.setPromateStrategy(new NoDiscountStrategy());
			break;
		}
		case 1: {

			ticket.setPromateStrategy(new QuaterDiscountStrategy());
			break;
		}
		
		default:
			ticket.setPromateStrategy(new HalfDiscountStrategy());
			break;
		}

	}

}
