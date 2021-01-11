public class diceRoll {
	public static void main(String[] args) {

		double diceVal = Math.floor(Math.random() * 10) % 6 + 1;
		System.out.println(diceVal);
	}
}
