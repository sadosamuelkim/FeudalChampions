public class User 
{
	public String Username;	
	public String Email;
	
	//Password is stored hashed
	public String Password;
	public long Level;
	
	//An array of indices pointing to the territory that the user owns, on a given gameboard.
	public int[] Territory;
	
	public User(String username, String email, String password) 
	{
		Territory = new int[81];
		Username = username;
		Level = 0;
		
		
	}	
	
	public boolean isLogged()
	{
		
		return true;
	}
	
	public boolean isFirstTime()
	{
		
		return true;
	}
}
