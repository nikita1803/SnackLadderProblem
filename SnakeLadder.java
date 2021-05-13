package snakeLadder;

public class SnakeLadder {
	public static void main(String[] args) {
		System.out.println("Welcome in snake and ladder simulation");
		
		
		int start_position_player1 = 0 ;
		int start_position_player2 = 0 ;
		int dice = 0 ;
		int dice2 = 0;
		int option = 0 ;
		int option2 = 0 ;
		int count = 0;
		int countp = 0;
		
		while(start_position_player1!=100 | start_position_player2!=100)
		{
			dice = (int) ((Math.random() * 10) % 6 + 1);
			System.out.println("player 1 dice value : " +dice);
			
			option = (int) ((Math.random() * 10) % 3 + 1);
			System.out.println("player 1 option value : "+option);
			switch(option) {
				case 1: //For no play
					System.out.println("No moves");
					count++;
				break;
				case 2: //For ladder
					start_position_player1 = start_position_player1 + dice ;
					count++;
					if(start_position_player1>100)
					{
						start_position_player1 = start_position_player1 - dice ;
						count++;
					}
					else
					{
						while(option==2)
						{
							dice = (int) ((Math.random() * 10) % 6 + 1);
							System.out.println("player 1 dice value : " +dice);
							//count++;
							option = (int) ((Math.random() * 10) % 3 + 1);
							System.out.println("player 1 option value : "+option);
							switch(option) {
								case 1: //For no play
									System.out.println("No moves");
									count++;
								break;
								case 2: //For ladder
									start_position_player1 = start_position_player1 + dice ;
									count++;
									if(start_position_player1>100)
									{
										start_position_player1 = start_position_player1 - dice ;
										
									}
									//System.out.println("Position of the player1 : " + start_position_player1);
									
									break;
								case 3: //For snake
										start_position_player1 = start_position_player1 - dice ;
										count++;
										if(start_position_player1<0)
										{
											start_position_player1=0;
											
										}
										//System.out.println("Position of the player1 : " + start_position_player1);
									break;
								}
							}
						
						}
					System.out.println("Position of the player1 : " + start_position_player1);
					
				break;
				case 3: //For snake
					start_position_player1 = start_position_player1 - dice ;
					count++;
					if(start_position_player1<0)
					{
						start_position_player1=0;
					}
					System.out.println("Position of the player1 : " + start_position_player1);
				break;
			}
			
			// For player 2
			
			dice2 = (int) ((Math.random() * 10) % 6 + 1);
			System.out.println("player 2 dice value : " +dice2);
			
			option2 = (int) ((Math.random() * 10) % 3 + 1);
			System.out.println("player 2 option value : "+option2);
			switch(option2) {
				case 1: //For no play
					System.out.println("No moves");
					countp++;
				break;
				case 2: //For ladder
					start_position_player2 = start_position_player2 + dice2 ;
					countp++;
					if(start_position_player2>100)
					{
						start_position_player2 = start_position_player2 - dice2 ;
						countp++;
					}
					else
					{
						while(option2==2)
						{
							dice2 = (int) ((Math.random() * 10) % 6 + 1);
							System.out.println("player 2 dice value : " +dice2);
							//count++;
							option2 = (int) ((Math.random() * 10) % 3 + 1);
							System.out.println("player 2 option value : "+option2);
							switch(option2) {
								case 1: //For no play
									System.out.println("No moves");
									countp++;
								break;
								case 2: //For ladder
									start_position_player2 = start_position_player2 + dice2 ;
									countp++;
									if(start_position_player2>100)
									{
										start_position_player2 = start_position_player2 - dice2 ;
										
									}
									//System.out.println("Position of the player1 : " + start_position_player1);
									
									break;
								case 3: //For snake
										start_position_player2 = start_position_player2 - dice2 ;
										countp++;
										if(start_position_player2<0)
										{
											start_position_player2=0;
											
										}
										//System.out.println("Position of the player1 : " + start_position_player1);
									break;
								}
							}
						
						}
					System.out.println("Position of the player2 : " + start_position_player2);
					
				break;
				case 3: //For snake
					start_position_player2 = start_position_player2 - dice2 ;
					countp++;
					if(start_position_player2<0)
					{
						start_position_player2=0;
					}
					System.out.println("Position of the player2 : " + start_position_player2);
				break;
			}
			
		}
		
	System.out.println("dice role to win the game for player1 " + count);
	System.out.println("dice role to win the game for player2 " + countp);
		
		if(count>countp) {
			System.out.println("Player 2 wins the match");
		}
		else {
			System.out.println("Player 1 wins the match");
		}
			
	}
}



