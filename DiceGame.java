import javax.swing.JOptionPane;



import Q1.dice;



public interface DiceGame 

{

	public class test_main 

	{

		public static void main(String[] args)

		{



			boolean iLoop = true;

			int totalDice;

			int userGuess;

			int guessCount = 0;



			while (iLoop == true)

			{

				dice userRoll = new dice();

				totalDice = Integer.parseInt(JOptionPane.showInputDialog("# of Dice to be rolled: "));

				userRoll.Throw(totalDice);



				boolean guessedRight = false;

				guessCount = 0;

				

				do

				{

					userGuess = Integer.parseInt(JOptionPane.showInputDialog("Guess the total you rolled: "));

					

					if (userGuess == userRoll.rollTotal())

					{

						JOptionPane.showMessageDialog(null, String.format("That's correct. You guessed a total of %d times", guessCount));

						guessedRight = true;

					}

					else if (userGuess > userRoll.rollTotal())

					{

						JOptionPane.showMessageDialog(null,  "Your guess was too high");

						guessCount++;

					}

					else if (userGuess < userRoll.rollTotal())

					{

						JOptionPane.showMessageDialog(null, "Your guess was too low");

						guessCount++;

					}

						

				} while (guessedRight == false);

				

				JOptionPane.showMessageDialog(null, String.format("\nYou rolled: %s \n The total of your roll: %d", userRoll.rolledThis(), userRoll.rollTotal()));



			}

		}

	}

}

