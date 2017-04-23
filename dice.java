public class dice
{

	int diceRoll;

	int diceTotal = 0;

	String numbersRolled = "";



	public void Throw(int howManyDice)

	{

		for (int count = 0; count < howManyDice; count++)

		{

			diceRoll = 1 + (int)(Math.random() * 6);



			if (count > 0)

				numbersRolled = numbersRolled + ", ";



			numbersRolled = numbersRolled + Integer.toString(diceRoll);

			diceTotal = diceTotal + diceRoll;

		}

	}

	public int rollTotal()

	{

		return this.diceTotal;

	}



	public String rolledThis()

	{

		return this.numbersRolled;

	}

}

