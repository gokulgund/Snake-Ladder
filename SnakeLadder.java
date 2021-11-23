package snake_ladder;

public class SnakeLadder {

	public static void main(String[] args) {
		int position=0;
		System.out.println("Welcome into Snake & Ladder Program !!");
		System.out.println("Your Starting Position Is : " +position);
		int Dice = (int)Math.floor(Math.random()*10)%6+1;	
		System.out.println("Your Dice Value is : " +Dice);
		
		int value = (int)Math.floor(Math.random()*10)%3+1;	
		System.out.println("Your case Value is : " +value);
		
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
