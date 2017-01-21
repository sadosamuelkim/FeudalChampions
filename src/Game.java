/**************************************\
*	Game.java
*
*	Contains the class information for
*	a complete game of Feudal Champions.
*	
*
*	
*
*	
*
\**************************************/

public class Game
{
	public PlayingField GameBoard;
	public User User1;
	public User User2;
	public Game(User user1, User user2) 
	{
		User1 = user1;
		User2 = user2;
		GameBoard = new PlayingField();
		
		/*Assign the territory to the players: The first 9 blocks to the first user, and the
		last 9 to the second user.*/
		int i, j = 0;
		for (i = 0; i < 9; i++) User1.Territory[i] = i;	
		for (i = 72; i < 81; i++) User2.Territory[j++] = i;			
	}
	
	public void EndGame()
	{
		User1.Territory = new int[81];
		User2.Territory = new int[81];
	
	}
}
