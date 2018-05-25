public class NumericQuestion extends Question
{       
	/**
		Sets the text of the question.
		@param questionText The question being asked.
	*/
	public void setText(String questionText)
	{
		super.setText(questionText);
	}
	/**
		Sets the answer to the question.
		@param response Takes in a float value inputted by the user then converts to string and compares the answer.
	*/
	public void setAnswer(float response)
	{
		String reply = Float.toString(response);
		super.setAnswer(reply);
	}
        
        public boolean checkAnswer(String response) {
            float newResponse = Float.parseFloat(response);
            float newAnswer = Float.parseFloat(answer);
            if(Math.abs(newResponse - newAnswer) < 0.01) {
                return true;
            }
            else {
                return false;
            }
        }
}