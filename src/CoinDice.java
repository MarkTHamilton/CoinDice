
public class CoinDice {

	public static void main(String[] args) {
		int heads = 0;
		int tails = 0;
		for(int i = 0; i< 10; i++)  {
			int side = (int)(Math.random() * 2);
			if(side == 0)  {
				System.out.println("Heads");
				heads ++;
			}
			else  {
				System.out.println("Tails");
				tails++;
			}
		}
		System.out.println("Number of heads: " + heads);
		System.out.println("Number of tails: " + tails);
		
		for(int i = 0; i< 10; i++)  {
			int die = (int)(Math.random() * 6) + 1;
			System.out.println("Dice roll number: " + die);
			//Add comment to confirm
			//Test one more after pushing
		}
	}
	
}
