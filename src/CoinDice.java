
public class CoinDice {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			int side = (int)(Math.random() * 2);
			if(side == 0)  {
				System.out.println("Heads");
			}
			else  {
				System.out.println("Tails");
			}
		}
	}
	
}
