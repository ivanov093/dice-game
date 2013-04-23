dice-game
=========
public class Dice
{
  public int computerRoll()
  {
  	int number;
  	number = ((int)Math.random()*6 + 1);
  	return number;
  }
  
  public String result(int diceOneRoll, String userGuess )
  {
  	String win;
  	if (diceOneRoll <= 3 && userGuess == "low")
  	{
  		win = "You won!";
  	}
  	else if (diceOneRoll > 3 && userGuess == "high")
  	{
  		win = "You won!";
  	}
  	else
  	{
  		win = "You Lost!";
  	}
  	
  	return win;
  }
  
  public String result(int diceOneRoll, String userGuess, int mid )
  {
  	String win;
  	if (diceOneRoll <= mid && userGuess == "low")
  	{
  		win = "You won!";
  	}
  	else if (diceOneRoll > mid && userGuess == "high")
  	{
  		win = "You won!";
  	}
  	else
  	{
  		win = "You Lost!";
  	}
  	
  	return win;
  }
  
  public int sumOfRolls (int numOfRolls)
  {
  	int number = 0;
  	for ( int x = numOfRolls ; x > 0; x--)
  	{
  		number = ((int)Math.random()*6 + 1);
  		number += number;
  	}
  	
  	return number;
  }
}
