package ex42;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Yussef Abdelbary
 */

/*Similar to ex 41 we read in a file containing First name Last name and now salaries of an individual
**Now we create a method that is going to be responsible for parsing the file
**Next we hard cpde the structure of the table in Last name First name and Salary
**Use a forloop to go through the input file to put these values in an array
**finally at the values that are read from the input file put them into a print out statement.
 */

public class App
{
    public static void main( String[] args ) throws IOException
    {
        String table;
        table = parseInfoFromFile();
        printTable(table);//After we create the table and gather the information from the input file we can now display the table in an output file
    }

    public static String parseInfoFromFile() throws IOException/*Grabs the information from the input file we created with the given input
    using the method buffer reader*/

    {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/ex42/exercise42_input.txt"));//specifying where the file that we have to read in from is located

        String line;

        StringBuilder outputTable = new StringBuilder();

        outputTable.append("Last      First     Salary\n--------------------------\n");//This is just structure of the table with labels for the information we gather from the input file

        while((line = br.readLine()) != null)//This just goes throguh the file line by line until the condition is met being there is nothing left to read from the input file

        {
            String[] info = line.split(",");//Allows for the format of the table to be correct because it tells the compiler when to stop and split up the data from the input file
            outputTable.append(String.format("%-10s", info[0])).append(String.format("%-10s", info[1])).append(String.format("%-6s", info[2])).append("\n");/*THis is the final table after parsing the information and reaching the end
            of the input file*/
        }

        return outputTable.toString();
    }

    public static void printTable(String tableContent)
    {
        System.out.println(tableContent);
    }
}


