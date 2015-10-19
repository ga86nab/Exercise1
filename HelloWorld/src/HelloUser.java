import java.util.Scanner;

public class HelloUser {
	
	private String userName;
	
	public HelloUser()
	{
		System.out.println("Please enter your name:");
		Scanner scanner = new Scanner(System.in);
		userName = scanner.nextLine();
		
		greetUser();
	}
	
	private void greetUser()
	{
		System.out.printf("Hello %s!", userName);		
	}
}
