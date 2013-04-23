import java.util.Scanner;

public class diceGame1
{
  public static void main( String[] args)
  {
  		
  	Dice diceRoll = new Dice();
  	Dice gameOutcome = new Dice();
  	Scanner input = new Scanner( System.in );
  	
  	
  	int diceOneRoll =  diceRoll.computerRoll();
  	
  	
  	System.out.println("Guess \"low\" (1-3)) or \"high\"(4-6) as is: ");
  	String userGuess = input.next();
  	
  	
  	String outcome = gameOutcome.result(diceOneRoll, userGuess);
  	System.out.printf("\n%s\n", gameOutcome);
  }
}
