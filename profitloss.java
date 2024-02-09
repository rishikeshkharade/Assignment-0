
public class profitloss {
	public static void main(String[] args) {
		int sellingprice=500;
		int costprice=500;
		if (sellingprice>costprice) {
			System.out.println("profit of " +(sellingprice-costprice));
		}else if (sellingprice<costprice) {
			System.out.println("loss of " +(costprice-sellingprice));
		}else {
			System.out.println("no profit or loss");
			
		}
	}
}
