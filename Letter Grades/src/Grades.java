import java.util.Scanner;

public class Grades {
	public static void main(String[] args)
	{
		System.out.println("Enter your letter grade: ");	
	
		Scanner userInput = new Scanner(System.in);
		char letter;
		letter = userInput.next ().charAt(0);

		switch (letter){
		case'A':
		case'a':
			System.out.println("You must have scored 90.0-100");
			break;
		case 'B':
		case 'b':
			System.out.println("You must have scored 80.0-89.9");
			break;
		case 'C':
		case 'c':
			System.out.println("You must have scored 70.0-79.9");
			break;
		case 'D':
		case 'd':
			System.out.println("You must have scored 60.0-69.9");
			break;
		case 'F':
		case 'f':
			System.out.println("Sorry you must have scored below 60 ");
			break;
		default:
			System.out.println("Please enter a gradeletter from A-D,F: ");
		}
	userInput.close();
	}
}
