import java.util.ArrayList;
public class snakeAndLadder {
	private static final int IS_SNAKE = 0;
	private static final int IS_LADDER = 1;

	public static void main(String[] args) {
		ArrayList<Integer> player_position = new ArrayList<Integer>();
		int position = 0;
		int no_of_times_dice_was_rolled = 0;
		System.out.println("The position of the player was: "+ position);
		while (position < 100) {
			double diceVal = Math.floor(Math.random() * 10) % 6 + 1;
			double option = Math.floor(Math.random() * 10) % 3;

			switch ((int)option) {
			case IS_SNAKE:
				no_of_times_dice_was_rolled += 1;
				position -= diceVal;
				if (position < 0) {
					position = 0;
					System.out.println("Number on the dice: "+ diceVal);
					System.out.println("Since player can't go behind position 0 player stays at position: " + position);
					player_position.add(position);
				}
				else
					System.out.println("Number on the dice: "+ diceVal);
					System.out.println("Player got snake so moved back to position: " + position);
					player_position.add(position);
				break;
			case IS_LADDER:
				position += diceVal;
				no_of_times_dice_was_rolled += 1;
				if (position > 100) {
					position -= diceVal;
					System.out.println("Number on the dice: "+ diceVal);
					System.out.println("Since the number on dice is more then required player stays at position: " + position);
					player_position.add(position);
				}
				else
					System.out.println("Number on the dice: "+ diceVal);
					System.out.println("Player got ladder so moved ahead to position: " + position);
					player_position.add(position);
				break;
			default:
				System.out.println("Player didn't play so current position: " + position);
			}

		}
		System.out.println("The dice was rolled "+ no_of_times_dice_was_rolled +" number of times");
		System.out.println("The positions of the player after every dice roll are: ");
		for (int i : player_position) {
		      System.out.println(i);
		    }
	}
}
