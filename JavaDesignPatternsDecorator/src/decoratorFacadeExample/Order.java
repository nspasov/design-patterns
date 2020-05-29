package decoratorFacadeExample;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		BurgerFacade burgerFacade = new BurgerFacade();
		
		Burger burger = new Burger() 
		{
			
			public void addSupplement () {}
			
		};
		
		boolean validChoice = false;
		
		int choice;
		
		do{
		System.out.println("Hello, please choose one of our tasty burger options!");
		System.out.println("Press 1 for Regular burger");
		System.out.println("Press 2 for burger with cheese");
		System.out.println("Press 3 for burger with egg");
		
		choice = scanner.nextInt();
		
		switch(choice)
		{
		
		case 1:
			burgerFacade.orderClassicBurger();
			validChoice = true;
			break;
		case 2:
			burgerFacade.orderBurgerWithCheese();
			validChoice = true;
			break;
		case 3:
			burgerFacade.orderBurgerWithEgg();
			validChoice = true;
			break;
		default:
			System.out.println("Invalid choice, please try again!");
			
		
		}
		
		
		}while(validChoice == false);
		
		
		
		
		
		
		
		

	}

}
