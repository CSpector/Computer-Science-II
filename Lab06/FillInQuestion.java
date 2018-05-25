import java.util.Scanner;
/**
	A question that the answer is filled in. Extends the Question class.
*/
public class FillInQuestion extends Question
{
	/**
		Sets the text and the answer for the question.
		@param text The question as a whole.
	*/
	public void setText(String text)
	{
		Scanner inpText = new Scanner(text);
		// Used to split the text up
		inpText.useDelimiter("_");
		String question = inpText.next();
		super.setText(question);
		String answer = inpText.next();
		super.setAnswer(answer);
	}
}