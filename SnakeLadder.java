package snakeLadder;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("Welcome in snake and ladder simulation");
		
		
		int start_position_player1 = 0 ;
		int dice = 0 ;
		int option = 0 ;
		int count=0;
		while(start_position_player1!= 100)
		{
			dice = (int) ((Math.random() * 10) % 6 + 1);
			System.out.println("dice value"+dice);
			count++;
			option = (int) ((Math.random() * 10) % 3 + 1);
			System.out.println("option value"+option);
			switch(option) {
				case 1: //For no play
					System.out.println("No moves");
				break;
				case 2: //For ladder
					start_position_player1 = start_position_player1 + dice ;
					if(start_position_player1>100)
					{
						start_position_player1 = start_position_player1 - dice ;
					}
					System.out.println("Position of the player" + start_position_player1);
				break;
				case 3: //For snake
					start_position_player1 = start_position_player1 - dice ;
					if(start_position_player1<0)
					{
						start_position_player1=0;
					}
					System.out.println("Position of the player" + start_position_player1);
				break;
			}
		}
		System.out.println("dice role to win the game is " + count);
	}

}
