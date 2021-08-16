import java.util.ricardo;
public class main {

	public static void main(String[] args) {
		ricardo ricardo= new ricardo(System.in);
		System.out.println("Plse give us your name ");
		String name=ricardo.nextLine();
		System.out.println("Your age: ");
		int age=ricardo.nextInt();
		ricardo.nextLine();
		System.out.println("What is your favorite food?");
		String food=ricardo.nextLine();
		if(age<1)
		{
			
				System.out.println("\"Erreur!\"");
				
		}
		else
		{
			System.out.print("Welcome "+name+" Glad to know you! ");
			if(age==1)
			{
				System.out.println("You are "+age+" year old!");
			}
			
			
			else
			{
				System.out.println("You are "+age+" years old!");
			}
		  System.out.println("Your favorite food is: "+food );
		}
		
		
	}

}
