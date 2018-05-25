/**
	A question with multiple correct choices. Extends the ChoiceQuestion class.
*/
public class AnyCorrectChoiceQuestion extends ChoiceQuestion
{
	/**
		Adds the choices to the question.
		@param choice The choice.
		@param answer If the answer is true or false.
	*/
	public void addChoice(String choice, boolean answer)
	{
		super.addChoice(choice, answer);
	}
	/**
		Displays the question and the choices as well as informing the user that there are multiple choices.
	*/
	public void display()
	{
		super.display();
		System.out.println("There might be multiple correct choices!");
	}
}