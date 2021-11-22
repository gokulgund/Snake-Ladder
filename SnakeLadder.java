package snake_ladder;

public class SnakeLadder {

	public static void main(String[] args) {
		int position=0;
		System.out.println("Welcome into Snake & Ladder Program !!");
		System.out.println("Your Starting Position Is : " +position);
		Dice();
	}
	public static void Dice() {
		int Dice = (int)Math.floor(Math.random()*10)%6+1;	
		System.out.println("Your Dice Value is : " +Dice);
	
	}

}
