import java.util.*;
public class ATMMain {
	static int count = 0;
	static final int PIN = 6862;
	static double balance = 0.0;
	static boolean done = false;
	static double inputDouble;
	static Scanner keyboardInput = new Scanner(System.in);
	public static void main(String[] args) {
		int intInput;
		
		System.out.println("Enter your PIN: ");
		intInput = keyboardInput.nextInt();
		while(!(intInput == PIN)) {
			System.out.println("Incorrect PIN, try again:");
			intInput = keyboardInput.nextInt();
		}
		Menu();
	}
	
	static void Menu() {
		String inputString;
		System.out.println("Would you like to do a deposit or a withdrawl or are you done? ");
		inputString = keyboardInput.nextLine();
		while(!done) {			
			inputString = keyboardInput.nextLine();
			if (inputString.equals("deposit")){
				System.out.println("How much would you like to deposit? ");
				inputDouble = keyboardInput.nextDouble();
				Deposit(inputDouble);
				System.out.println("Would you like to do a deposit or a withdrawl or are you done? ");
			} else if (inputString.equals("withdrawl")){
				System.out.println("How much would you like to withdraw? ");
				inputDouble = keyboardInput.nextDouble();
				Withdrawl(inputDouble);
				System.out.println("Would you like to do a deposit or a withdrawl or are you done? ");
			} else if (inputString.equals("done")){
				break;
			} 			
			
		}
	}
		
	
	
	static void Deposit(double depositAmount) {
		balance += depositAmount;			
		String stateBalance = "Your new balance is: $" + Double.toString(balance);
		System.out.println(stateBalance);	
	}
	
	static void Withdrawl(double withdrawlAmount) {
		balance -= withdrawlAmount;			
		String stateBalance = "Your new balance is: $" + Double.toString(balance);
		System.out.println(stateBalance);		
	}
}
