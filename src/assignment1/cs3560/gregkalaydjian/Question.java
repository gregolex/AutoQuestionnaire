package *PACKAGE_NAME*;

public class Question 
{
    //This method will return a String array of different questions
    //* Instead of predefined questions, we can make an array based off of user input and use the user input array. *
    //* As specified in the project requirements *
    protected static String[] questionList(int amountOfQuestions)
        {
           String[] questionArray = new String[amountOfQuestions];
           String[] questionCollection = {"In miles per hour, what is the speed of light in Miles Per Second? [A. 182,282] [B. 186,433] [C. 164,232] [D. 143,232]",
                                            "Natural pearls are found in what sea creature? [A. Clams] [B. Lobster] [C. Eel] [D. Oysters]",
                                            "How many time zones does China have? [A. Three] [B. Four] [C. One] [D. Two]",
                                            "How many earths would fill up the sun? [A. Three Million] [B. One Million] [C. Six Million] [D. Eight Million]",
                                            "How many hearts does an octopus have? [A. One] [B. Two] [C. Four] [D. Three]"};
           for(int x = 0; x < amountOfQuestions; x++)
            {
                questionArray[x] = questionCollection[x];
            }
           
           return questionArray;
        }

    //This method will return a String array of different questions
    protected static String[] getQuestions(int amountOfQuestions)
        {
            String[] questionArray = new String[amountOfQuestions];
           return questionArray;
        }
        
    //This method will display the questions that are stored in the questionsArray
    protected static void displayQuestions(String[] questionsArray, int amountOfQuestions)
        {
        String targetQuestion = "";
        System.out.println("The questions are as follows: ");
        for (int i = 0; i < amountOfQuestions; i++)
        {
            targetQuestion = questionsArray[i];
            System.out.print(i + 1 + ": ");
            System.out.println(targetQuestion);
        }    
    }
}
