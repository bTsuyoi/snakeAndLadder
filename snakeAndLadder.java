public class snakeAndLadder {
	private static final int IS_SNAKE = 0;


	public static void main(String[] args) {

		int position_player_1 = 0;
		int position_player_2 = 0;
		int turn = 1;
		while (position_player_1 < 100 && position_player_2 < 100) {

			if (turn == 1) {
				double diceVal_player_1 = Math.floor(Math.random() * 10) % 6 + 1;
				double option_player_1 = Math.floor(Math.random() * 10) % 2;

				switch ((int)option_player_1) {
				case IS_SNAKE:
					position_player_1 -= diceVal_player_1;
					if (position_player_1 < 0) {
						position_player_1 = 0;
					}
					turn = 2;
					break;
				default:
					position_player_1 += diceVal_player_1;
					if (position_player_1 > 100) {
						position_player_1 -= diceVal_player_1;
					}
					break;
				}
			}
			else {
				double diceVal_player_2 = Math.floor(Math.random() * 10) % 6 + 1;
				double option_player_2 = Math.floor(Math.random() * 10) % 2;

				switch ((int)option_player_2) {
				case IS_SNAKE:
					position_player_2 -= diceVal_player_2;
					if (position_player_2 < 0) {
						position_player_2 = 0;
					}
					turn = 1;
					break;
				default:
					position_player_2 += diceVal_player_2;
					if (position_player_2 > 100) {
						position_player_2 -= diceVal_player_2;
					}
					break;
				}
			}
		}
		if (position_player_1 == 100) {
			System.out.println("Player one won.");
		}
		else
			System.out.println("player two won.");
	}
}
