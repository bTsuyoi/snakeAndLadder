public class snakeAndLadder {
	private static final int IS_SNAKE = 0;
	private static final int IS_LADDER = 1;

	public static void main(String[] args) {

		int position = 0;

		System.out.println("The position of the player was: "+ position);
		double diceVal = Math.floor(Math.random() * 10) % 6 + 1;
		double option = Math.floor(Math.random() * 10) % 3;

		switch ((int)option) {
		case IS_SNAKE:
			position -= diceVal;
			System.out.println("Number on the dice: "+ diceVal);
			System.out.println("Player got snake so moved back to position: " + position);
			break;
		case IS_LADDER:
			position += diceVal;
			System.out.println("Number on the dice: "+ diceVal);
			System.out.println("Player got ladder so moved ahead to position: " + position);
			break;
		default:
			System.out.println("Player didn't play so current position: " + position);
		}


	}
}
