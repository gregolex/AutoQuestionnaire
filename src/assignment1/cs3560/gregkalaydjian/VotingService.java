package assignment1.cs3560.gregkalaydjian;
import java.util.*;

public class VotingService 
{
    //This method will randomize the answers for each user instead of asking for their input
    //* As specified in the project requirements *
    protected static String[] answerList(int amountOfAnswers)
    {
        String[] answersArray = new String[amountOfAnswers];
        String[] answersList = {"A","D","C","B","D"};
        
        for (int i = 0; i < amountOfAnswers; i++)
        {
            answersArray[i] = answersList[i];
        }
        
        return answersArray;
    }
    
    //This method will generate random answers for the candidates
    protected static String[][] generateAnswers(int amountOfCandidates, int amountOfQuestions)
    {
        Random r = new Random();
        int randomNumber = 0;
        String[][] studentAnswersArray = new String[amountOfCandidates][amountOfQuestions];
        
        for (int x = 0; x < amountOfCandidates; x++)
        {
            for (int y = 0; y < amountOfQuestions; y++)
                {
                    randomNumber = r.nextInt(4);
                    if (randomNumber == 0)
                    {
                        studentAnswersArray[x][y] = "A";
                    }
                    if (randomNumber == 1)
                    {
                        studentAnswersArray[x][y] = "B";
                    }
                    if (randomNumber == 2)
                    {
                        studentAnswersArray[x][y] = "C";
                    }
                    if (randomNumber == 3)
                    {
                        studentAnswersArray[x][y] = "D";
                    }
                    
                }
        }
        return studentAnswersArray;
    }
    
    //This method checks the generated array answers for correctness.
    //* The pre-defined answers here can be user input using an array instead of the pre-defining. *
    //* As specified in the project requirements *
    protected static int[][] checkCorrect(int amountOfCandidates, int amountOfQuestions, String[][] studentAnswersArrayGenerated, String[] answersArray)
    {
    int[][] studentAnswersCorrectArrayGenerated = new int[amountOfCandidates][amountOfQuestions];
    for (int x = 0; x < amountOfCandidates; x++)
        {
            for (int y = 0; y < amountOfQuestions; y++)
                {
                   if (y == 0)
                   {
                       if (studentAnswersArrayGenerated[x][y].equals("A"))
                       {
                           studentAnswersCorrectArrayGenerated[x][y] = 1;
                       }
                       else
                       {
                           studentAnswersCorrectArrayGenerated[x][y] = 0;
                       }
                   }
                    
                   if (y == 1)
                   {
                       if (studentAnswersArrayGenerated[x][y].equals("D"))
                       {
                           studentAnswersCorrectArrayGenerated[x][y] = 1;
                       }
                       else
                       {
                           studentAnswersCorrectArrayGenerated[x][y] = 0;
                       }
                   }
                   
                   if (y == 2)
                   {
                       if (studentAnswersArrayGenerated[x][y].equals("C"))
                       {
                           studentAnswersCorrectArrayGenerated[x][y] = 1;
                       }
                       else
                       {
                           studentAnswersCorrectArrayGenerated[x][y] = 0;
                       }
                   }
                   
                   if (y == 3)
                   {
                       if (studentAnswersArrayGenerated[x][y].equals("B"))
                       {
                           studentAnswersCorrectArrayGenerated[x][y] = 1;
                       }
                       else
                       {
                           studentAnswersCorrectArrayGenerated[x][y] = 0;
                       }
                   }
                   
                   if (y == 4)
                   {
                       if (studentAnswersArrayGenerated[x][y].equals("D"))
                       {
                           studentAnswersCorrectArrayGenerated[x][y] = 1;
                       }
                       else
                       {
                           studentAnswersCorrectArrayGenerated[x][y] = 0;
                       }
                   }
                   
                }
        }
        return studentAnswersCorrectArrayGenerated;
    }
    
    //This method will count the amount of correct answers for each question and put the count into an array
    protected static int[] displayStatistics(int amountOfCandidates, int amountOfQuestions, int[][] studentAnswersCorrectArrayGenerated, String[] answersArray)  
    {
    int[] correctAmountPerQuestion = new int[amountOfQuestions];  
    for (int x = 0; x < amountOfCandidates; x++)
        {
            for (int y = 0; y < amountOfQuestions; y++)
                {
                   if (y == 0)
                   {
                       if (studentAnswersCorrectArrayGenerated[x][y] == 1)
                       {
                           correctAmountPerQuestion[y]++;
                       }
                   }
                    
                   if (y == 1)
                   {
                       if (studentAnswersCorrectArrayGenerated[x][y] == 1)
                       {
                           correctAmountPerQuestion[y]++;
                       }
                   }
                   
                   if (y == 2)
                   {
                       if (studentAnswersCorrectArrayGenerated[x][y] == 1)
                       {
                           correctAmountPerQuestion[y]++;
                       }
                   }
                   
                   if (y == 3)
                   {
                       if (studentAnswersCorrectArrayGenerated[x][y] == 1)
                       {
                           correctAmountPerQuestion[y]++;
                       }
                   }
                   
                   if (y == 4)
                   {
                       if (studentAnswersCorrectArrayGenerated[x][y] == 1)
                       {
                           correctAmountPerQuestion[y]++;
                       }
                   }
                   
            }
        }
    return correctAmountPerQuestion;
    }
    
    //This method will display the correct and incorrect answers also contingent to the amount of candidates
    protected static void displayAmountCorrect(int[] correctAmountPerQuestion, int amountOfQuestions, int amountOfCandidates)
    {
        int targetedQuestionAmountCorrect = 0;
        int targetedQuestion = 0;
        for (int i = 0; i < amountOfQuestions; i++)
        {
            targetedQuestion = i + 1;
            targetedQuestionAmountCorrect = correctAmountPerQuestion[i];
            System.out.println("The amount correct for question " + targetedQuestion + " is: " + targetedQuestionAmountCorrect);
            System.out.println("The amount incorrect for question " + targetedQuestion + " is: " + (amountOfCandidates - targetedQuestionAmountCorrect));
        }
    
    }
    
    //This method allows the user to change their answer after the computer has generated answers for each user
    //* As specified in the project requirements *
    protected static void changeAnswer(int amountOfCandidates, int amountOfQuestions, String[][] studentAnswersArrayGenerated,
            String[] answersArray, String[] idArray, String[] nameArray)
    {
        //creating studentAnswersArrayNatural for modifying answers
        String[][] studentAnswersArrayNatural = new String[amountOfCandidates][amountOfQuestions];
        //Copy the generated array and use the copy instead of the original.
        studentAnswersArrayNatural = studentAnswersArrayGenerated;
        //Keyboard so we can detect user input.
        Scanner keyboard = new Scanner(System.in);
        //Declarations
        String target = "";
        String target2 = "";
        String targetID = "";
        String questionNumString = "";
        String currentAnswer = "";
        String changeAnswer = "";
        String newAnswer = "";
        String takingInput = "";
        String userInput = "";
        int showingQuestionNum = 0;
        int targetInteger = 0;
        int targetIndex = 0;
        int questionNum = 0;
        int changeAnswerInt = 0;
        int takingInputInt = 0;
        int userInputInt = 0;
        
        //Asking the user if they want to chang ethe answer
        System.out.println("If you wish to make a change to your answers type '1' and press enter ");
        System.out.println("otherwise press '0' and the enter key to end the program");
        target = keyboard.nextLine(); 
        targetInteger = Integer.parseInt(target);
        
        //While loop triggered while user wants to change an answer.
        while(targetInteger == 1)
        {
            //Asking user what their ID is.
            System.out.println("Find your user ID above, type it in and press enter");
            targetID = keyboard.nextLine();
            targetIndex = Integer.parseInt(targetID);
            targetIndex = targetIndex - 1000;
            
            //Asking user what problem they want to focus on.
            System.out.println("Welcome " + nameArray[targetIndex] + " To the edit center.");
            System.out.println("What problem should we focus on? Type in a valid number and press enter.");
            questionNumString = keyboard.nextLine();
            questionNum = Integer.parseInt(questionNumString);
            showingQuestionNum = questionNum;
            questionNum = questionNum - 1;
            currentAnswer = studentAnswersArrayGenerated[targetIndex][questionNum];
            
            //Asking user if they want to change the answer
            System.out.println("Current Answer: " + currentAnswer);
            System.out.println("Change Answer? If yes type '1' and press enter. Otherwise just press '0' and enter to exit");
            changeAnswer = keyboard.nextLine();
            changeAnswerInt = Integer.parseInt(changeAnswer);
            
            //If they want to change the answer they will go into this while loop
            while (changeAnswerInt == 1)
            {
                //Asking user what answer they would like
                System.out.println("What would you like your new answer to be for question " + showingQuestionNum + " Hint: Capitalize a letter answer");
                newAnswer = keyboard.nextLine();
                studentAnswersArrayNatural[targetIndex][questionNum] = newAnswer;
                
                //Checking answer
                if (studentAnswersArrayNatural[targetIndex][questionNum].equals(answersArray[questionNum]))
                {
                    System.out.println("Correct!");
                }
                else
                {
                    System.out.println("Incorrect");
                }
                 
                //Asking user if they want to go again
                System.out.println("Type '1' and press enter to try again or press 0 and enter to exit question");
                takingInput = keyboard.nextLine();
                takingInputInt = Integer.parseInt(takingInput);
                if (takingInputInt == 1)
                {
                    changeAnswerInt = 1;
                }
                else
                {
                    changeAnswerInt = 0;
                }
            }
            
            //Asking user if they want to start over with the modification process
            System.out.println("Start Modification Process Again? Type 1 and press enter if you do. Type 0 and press enter if not.");
            userInput = keyboard.nextLine();
            userInputInt = Integer.parseInt(userInput);
            if (userInputInt == 1)
            {
                targetInteger = 1;
            }
            else
            {
                targetInteger = 0;
            }
        }
    }
}
