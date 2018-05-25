import java.util.Scanner;
import java.util.ArrayList;
/**
	File that is to be ran to generate the questions.
*/
public class QuestionsApp
{
	/**
		Initialized the questions, adds the questions into an arraylist and uses an enhanced for loop to print.
	*/
   public static void main(String[] args)
   {
	  // Intialized the ArrayList
	  ArrayList<Question> qArray = new ArrayList<Question>();
          int score = 0;
	  
      FillInQuestion first = new FillInQuestion();
      first.setText("The inventor of Java was _James Gosling_");
	  qArray.add(first);

      AnyCorrectChoiceQuestion second = new AnyCorrectChoiceQuestion();
      second.setText("In which country was the inventor of Java born?");
      second.addChoice("Australia", false);
      second.addChoice("Canada", true);
      second.addChoice("Denmark", false);
      second.addChoice("United States", false);
	  qArray.add(second);
	  
	  NumericQuestion third = new NumericQuestion();
	  third.setText("What is the value of PI to the nearest thousandth?");
	  third.setAnswer(3.141f);
	  qArray.add(third);
	  
	  NumericQuestion fourth = new NumericQuestion();
	  fourth.setText("What is the value of the Euler's number to the nearest thousandth?");
	  fourth.setAnswer(2.711f);
	  qArray.add(fourth);
	  
	  FillInQuestion fifth = new FillInQuestion();
	  fifth.setText("The inventor of Pascal was _Nicolas Wirth_");
	  qArray.add(fifth);
	  
	  AnyCorrectChoiceQuestion sixth = new AnyCorrectChoiceQuestion();
	  sixth.setText("The inventor of Pascal lived in: ");
	  sixth.addChoice("Australia", false);
	  sixth.addChoice("Canada", false);
	  sixth.addChoice("Denmark", false);
	  sixth.addChoice("United States", false);
	  sixth.addChoice("France", true);
	  qArray.add(sixth);
	  
	  // For loop to print out the questions to the user.
	  for (Question q: qArray)
	  {
              /**
                 Presents a question to the user and checks the response.
                 @param q the question
              */
		    q.display();
                    System.out.print("Your answer: ");
                    Scanner in = new Scanner(System.in);
                    String response = in.nextLine();
                    if(q.checkAnswer(response)) {
                        System.out.println("Right answer!");
                        score = score + 1;
                    }
                    else {
                        System.out.println("Wrong answer.");
                    }
                    System.out.println();
                        }
                        System.out.println("Total score is " + score + " out of 6.");
   }
   
}

