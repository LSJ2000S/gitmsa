package lsj01;


//import java.util.PrimitiveIterator;
import java.util.Scanner;

public class lsj01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("joe fck game import");
		System.out.println("you have entered a LoL. What would you like to do?");

		while (true) {
			System.out.println("\n1. move the top");
			System.out.println("2. move the mid");
			System.out.println("3. move the jng");
			System.out.println("4. move the bot");
			System.out.println("5. exit game");
			System.out.println("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("whats your champ");
				System.out.println("10. Urgot");
				System.out.println("11. Yone");
				System.out.println("12. Darius");

				break;

			case 2:
				System.out.println("whats your champ");
				System.out.println("13. Ari");
				System.out.println("14. Zed");
				System.out.println("15. faker");
				break;

			case 3:
				System.out.println("whats your champ");
				System.out.println("16: Lee sin");
				System.out.println("17: Viego");
				break;

			case 4:
				System.out.println("whats your champ");
				System.out.println("18. Ezreal");
				System.out.println("19. jix");
				break;

			case 5:
				System.out.println("exit game");
				return;

			default:
				System.out.println("again choice");
				break;
			}

			if (choice == 1) {
				System.out.println("Enter your choice: ");
				int subchoice = scanner.nextInt();
				scanner.nextLine();

				switch (subchoice) {
				case 10:
					System.out.println("You showed the best play and led the team to victory");
					scanner.close();
					return;

				case 11:
					System.out.println("You encountered Darius and were brutally torn apart");
					choice = 1;
					break; 

				case 12:
					System.out.println("We won the laning phase but lost the game");
					break;

				default:
					System.out.println("choice again");
					continue;
				}
			}

			
			if (choice == 2) {
				System.out.println("Enter your choice: ");
				int subchoice = scanner.nextInt();
				scanner.nextLine();
					
				
				switch (subchoice) {
				case 13:
					System.out.println("I surrendered the game because I was charmed by Ahri");
					break;

				case 14:
					System.out.println("Due to Zed's dismal skills, fights broke out among the teams");

					break;

				case 15:
					System.out.println("Im not Faker; wake up from your dream");
					break;

				default:
					System.out.println("choice again");
					break;
				}
			}

			if (choice == 3) {
				System.out.println("Enter your choice: ");
				int subchoice = scanner.nextInt();
				scanner.nextLine();

				switch (subchoice) {
				case 16:
					System.out.println("I let the strongest opponent pass through our team. We lost");
					break;

				case 17:
					System.out.println("Viego, who entered Ahri's body, couldn't come out. we lost");

					break;

				default:
					System.out.println("choice again");
					break;
				}
			}

			if (choice == 4) {
				System.out.println("Enter your choice: ");
				int subchoice = scanner.nextInt();
				scanner.nextLine();

				switch (subchoice) {
				case 18:
					System.out.println(
							"Congratulations! You ventured into Taric's embrace for a teleportation. Have a wonderful journey of love");
					return;

				case 19:
					System.out.println("jix is cute!");
					break;
				}
			}

		}

	}

}
