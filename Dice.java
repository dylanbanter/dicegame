package dice;
public class Dice {

	public static void main(String[] args) {
		Die userDie = new Die(6);
		Die computerDie = new Die(6);
		
		int userWins = 0;
		int computerWins = 0;
		int ties = 0;
		
		for(int RollDie = 1; RollDie <= 10; RollDie++) {
			userDie.roll();
			computerDie.roll();
			
			if(userDie.getValue() > computerDie.getValue() ) {
				userWins += 1;
			} else if(computerDie.getValue() > userDie.getValue() ) {
				computerWins = computerWins + 1;
			} else {
				ties += 1;
				
			}
		}
		if(userWins > computerWins) {
			System.out.println("The user is the grand winner with a score of "+ userWins + " wins. The" + " computer lost with a score of " + computerWins + " wins. The number of ties is: " + ties);
		} else if (computerWins > userWins) {
			System.out.println("The computer is the grand winner with a score of "+ computerWins + " wins. The" + " user lost with a score of " + userWins + " wins. The number of ties is:  " + ties);
		} else {
			System.out.println("Neither side won completely. They tied a total of "+ ties + " times. The computer won " + computerWins + " times and the user won " + userWins + " times.");

		}
		
		
	}

}
