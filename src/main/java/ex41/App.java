package ex41;



import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.Collections;



/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Yussef Abdelbary
 */



/*Psuedo code baackground (Additional to the comments)
 **We want to first make a file of the information that we were given
 **Next we create a Method that takes the information from the file and places it into an array containing values
 **Now that we have an array of names from the file input now we need to sort the names in the array
 **Now we have an array of sorted names we create another method to write to an output file
 **In that method we need to iterate through the sorted array via a forloop and create the base statements to organize the names into first and last name
 **Finally in main call the methods so the code can execute in a sequential order to create the output file
 */

public class App
{

    public static void main( String[] args ) throws IOException
    {


        ArrayList<String> names;

        names = readInFile();

        sortNames(names);

        createOutputFile(names);
    }



    public static ArrayList <String> readInFile() throws IOException //This gets the information from the input file that was created
    {
        ArrayList<String> allNames = new ArrayList<>();
        File file = new File("src/main/java/ex41/exercise41_input.txt");//This is the file we created that has our list of names

        Scanner scannedNames = new Scanner(file);

        while (scannedNames.hasNextLine())
        {
            allNames.add(scannedNames.nextLine());
        }

        return allNames;
    }




    public static ArrayList<String> sortNames(ArrayList<String> unsortedNames)//As the method name suggests it takes the names we gathered from the inpit file and sorts them
    {
        Collections.sort(unsortedNames);

        return unsortedNames;
    }




    public static void createOutputFile(ArrayList<String> sortedNames) throws IOException//This method now takes the sorted names and properly displays it into an output file
    {
        int x;

        FileWriter outputFile = new FileWriter("src/main/java/ex41/exercise41_output.txt");
        outputFile.write("Total of " + sortedNames.size() + " names\n");
        outputFile.write("-----------------\n");


        for (x=0; x<sortedNames.size(); x++)//Iterates through the array and making additions to the file that was created
        {
            outputFile.write(sortedNames.get(x) + "\n");
        }


        outputFile.close();//Once your done writing into a file close the file
    }
}

