package *PACKAGE_NAME*;
import java.util.*;
import java.io.*;

public class Student
{
    //This method returns a string array of unique ID's.
    protected static String[] getIDs(int amountOfCandidates)
    {
        //declarations.
        //array for id's of students.
        int[] idArrayInt = new int[amountOfCandidates];  
        String[] idArrayString = new String[amountOfCandidates];
        
        //for loop filling ID array with unique ID's.
        for (int i = 0; i < amountOfCandidates; i++)
        {
            idArrayInt[i] = i + 1000;
        }
        
        //for loop changing integer values into string values for project specifications.
        for (int i = 0; i < amountOfCandidates; i++)
        {
            idArrayString[i] = Integer.toString(idArrayInt[i]);
        }
        
        //return the array to the method call.
        return idArrayString;
    }
    
    //This method returns a string array of unique name ID's.
    //* Instead of using predefined names we can ask for names and store them in an array. *
    //* As specified in the project requirements *
    protected static String[] getNameIDs(String[] idArray, int amountOfCandidates)
    {
        //declarations.
        //array for id's of students.
        String[] nameArray = new String[amountOfCandidates];
        
        //This name Collection is pre-set due to the specifications of the project.
        //We can change this functionality to create names by asking the user for input.
        String[] nameCollection = {"Fred", "Hank", "George", "Dwight", "Hannah",
                                    "Dolly", "Nelly", "Portia", "Marriott", "Orla",
                                    "Newman", "Darrel", "Guevara","Manahil", "Greer",
                                    "Neo", "Tang", "Joe", "Estes", "Izaak", "Arnold",
                                    "Zakariyah", "Senior", "Dana", "Fowler", "Frazer",
                                    "Dickinson", "Benny", "Turner", "Kiera ", "Bob",
                                    "Hywel", "Brewer", "Karen", "Aguirre", "Fynley",
                                    "Donald","Riyad ","Morales","Jaylen ","Stephenson",
                                    "Amiyah ","Corona","Melisa","Hastings","Hampton"};
        
        //For each candidate, apply a name from the collection to the nameArray we will be using.
        for (int i = 0; i < amountOfCandidates; i++)
        {
            nameArray[i] = nameCollection[i];
        }
        return nameArray;
    }
    
    //This method will display the candidates and their ID's.
    //* As specified in the project requirements *
    protected static void displayCandidatesAndIDs(int amountOfCandidates,String[] nameArray,String[] idArray)
    {
        String targetName = "";
        String targetID = "";
        for (int i = 0; i < amountOfCandidates; i++)
        {
            targetName = nameArray[i];
            targetID = idArray[i];
            System.out.println("Name: " + targetName + ", ID: " + targetID);
        }
    }
}
