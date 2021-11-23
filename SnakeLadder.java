package snake_ladder;

class Utility {
	
	public void playOption(int position, int Dice) {
		
		while(position<=99) {
			int value = (int)Math.floor(Math.random()*10)%3+1;
			
			switch (value) {
			case 1:
				System.out.println("No Play You Are In Same Position");
				break;
			case 2:
				position=(position+Dice);
				System.out.println("Your Position After Ladder Is : " +position );
				break;
			case 3:
				position=(position-Dice);
				
				if(position<0) {
					position=0;
				}
					
				System.out.println("Your position After Snake Is : " +position);
				break;
			
			}
		}
		
	}
}

public class SnakeLadder {

	public static void main(String[] args) {
		int position=0;
		System.out.println("Welcome into Snake & Ladder Program !!");
		System.out.println("Your Starting Position Is : " +position);
		int Dice = (int)Math.floor(Math.random()*10)%6+1;
		
		Utility utility=new Utility();
		utility.playOption(position, Dice);
		
	}

}
